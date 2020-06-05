package com.boa.api.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import com.boa.api.domain.ParamEndPoint;
import com.boa.api.domain.Tracking;
import com.boa.api.domain.User;
import com.boa.api.request.CallDemandeCreditRequest;
import com.boa.api.request.CallFluxRequest;
import com.boa.api.response.CallDemandeCreditResponse;
import com.boa.api.response.CallFluxResponse;
import com.boa.api.service.util.ICodeDescResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class ApiService {

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	private final TrackingService trackingService;
	private final ParamEndPointService endPointService;
	private final UserService userService;
	private final WebClient.Builder webClient;

	public ApiService(TrackingService trackingService, ParamEndPointService endPointService, 
	UserService userService, WebClient.Builder webClient) {
		this.trackingService = trackingService;
		this.endPointService = endPointService;
		this.userService = userService;
		this.webClient = webClient;
	}

	/*public CallDemandeCreditResponse callDemandeCredit(CallDemandeCreditRequest callRequest,
			HttpServletRequest request) {
		log.info("callDemandeCredit [{}]", callRequest);
		Tracking tracking = new Tracking();
		//Optional<User> user = userService.getUserWithAuthorities();
		//String login = user.isPresent() ? user.get().getLogin() : "";
		CallDemandeCreditResponse response = new CallDemandeCreditResponse();
		ParamEndPoint endPoint = endPointService.findByCodeParam("callDemandeCredit");
		if (endPoint == null) {
			// set
			tracking = createTracking(ICodeDescResponse.ECHEC_CODE, "callDemandeCredit",
					ICodeDescResponse.SERVICE_ABSENT_DESC, callRequest.toString());
			trackingService.save(tracking);
			return response;
		}
		try {
			Map<String, Object> uriVariables = new HashMap<>();
			String jsonReq = new JSONObject()
			.put("CODE_MRK", callRequest.getCodeMrk())
			.put("CODE_MDL", callRequest.getCodeMdl())
			.put("NUM_WW", callRequest.getNumWw())
			.put("NUM_CHASSIS", callRequest.getNumChassis())
			.put("NUM_IMMAT", callRequest.getNumImmat())
			.put("PRIX_HT", callRequest.getPrixHt())
			.put("QUANTIEME", callRequest.getQuantieme())
			.put("FREQ_AP", callRequest.getFreqAp())
			.put("DATE_EFFET", callRequest.getDateEffet())
			.put("DATE_DER_ECH", callRequest.getDateDerEch())
			.put("DATE_PREM_ECH", callRequest.getDatePremEch())
			.put("MNT_FIN", callRequest.getMntFin())
			.put("MNT_AP", callRequest.getMntAp())
			.put("TX_AP", callRequest.getTxAp())
			.put("PRIX_TTC", callRequest.getPrixTtc())
			.put("TYPE_PAVI", callRequest.getTypePavi())
			.put("ECHEANCE", callRequest.getEcheance())
			.put("VERSSEMENT", callRequest.getVersement())
			.put("GRACE", callRequest.getGrace())
			.put("QT_03", callRequest.getQt03())
			.put("UNITE_GRACE", callRequest.getUniteGrace())
			.put("ID_TIRE", callRequest.getIdTire())
			.put("CPTE_BQ", callRequest.getCpteBcq())
			.put("CHARGE_CLT", callRequest.getChargeClt())
			.put("RIS", callRequest.getRis())
			.put("DOS_COM", callRequest.getDosCom())
			.put("ID_APPORTEUR", callRequest.getIdApporteur())
			.put("ETAT_INST", callRequest.getEtatInst())
			.put("ETAT_ENG", callRequest.getEtatEng())
			.put("ETAT_PROD", callRequest.getEtatProd())
			.put("DUREE", callRequest.getDuree())
			.put("TAUX_NOMINAL", callRequest.getTauxNominal())
			.put("GARANTIE", callRequest.getGuarantie())
			.put("NOOPER", callRequest.getNooper())
			.put("FLAG_CHARGE", callRequest.getFlagCharge())
			.put("DOSS", callRequest.getDoss())
			.put("TEG", callRequest.getTeg())

			.put("PAVI", callRequest.getPavi())
			.put("VR", callRequest.getVr())
			.put("ASS", callRequest.getAss())
			.put("TYPEDOSSIER", callRequest.getTypeDossier())
			.put("FRAIS_DOSS", callRequest.getFraisDoss())
			.put("FRAIS_ASS", callRequest.getFraisAss())
			.put("TYPE_FRAIS", callRequest.getTypeFrais())
			.put("DATE_TRAIT", callRequest.getDateTrait()).toString();
			uriVariables.put("Content-type", "application/json");
			String resp ="";
			String []tab = endPoint.getEndPoints().split("/services/");
			String baseUrl = tab[0]+"/services/";
			webClient.baseUrl(baseUrl).build().post().uri("callDemandeCredit")
			.bodyValue(resp).retrieve().bodyToMono(String.class).block();

			//ResponseEntity<String> resp = new RestTemplate().postForEntity
			//(endPoint.getEndPoints(),jsonReq,String.class, uriVariables);
			//Object resp = new RestTemplate().postForObject(endPoint.getEndPoints(),jsonReq,	String.class);
			//log.info("code resp [{}]", resp.toString());
			//log.info("code resp [{}]", resp.getStatusCode());
			//log.info("body resp [{}]", resp.getBody().toString());
			log.info("tab0 [{}]", tab[0]);
			log.info("tab1 [{}]", tab[1]);
		} catch (Exception e) {
			log.error("in callDemandeCredit [{}]", e);
			tracking = createTracking(ICodeDescResponse.ECHEC_CODE, "callDemandeCredit",
					ICodeDescResponse.ECHEC_DESCRIPTION, callRequest.toString());
		}
		trackingService.save(tracking);
		return response;
	}*/

	public CallDemandeCreditResponse callDemandeCredit(CallDemandeCreditRequest callRequest,
	HttpServletRequest request) {
		Tracking tracking = new Tracking();
		tracking.setDateRequest(Instant.now());
		//Optional<User> user = userService.getUserWithAuthorities();
		//String login = user.isPresent() ? user.get().getLogin() : "";
		CallDemandeCreditResponse response = new CallDemandeCreditResponse();
		ParamEndPoint endPoint = endPointService.findByCodeParam("callDemandeCredit");
		if (endPoint == null) {
			response.setCode(ICodeDescResponse.ECHEC_CODE);
			response.setDescription(ICodeDescResponse.SERVICE_ABSENT_DESC);
			response.setDateResponse(Instant.now());
			tracking = createTracking(tracking,ICodeDescResponse.ECHEC_CODE, "callDemandeCredit",
					ICodeDescResponse.SERVICE_ABSENT_DESC, callRequest.toString());
			trackingService.save(tracking);
			return response;
		}
		OutputStream os = null;
		try {
			log.info("end point wso2== [{}]", endPoint.getEndPoints());
            URL url = new URL(endPoint.getEndPoints());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
			//conn.setRequestProperty("Accept", "application/json");
			String jsonReq = new JSONObject()
			.put("CODE_MRK", callRequest.getCodeMrk())
			.put("CODE_MDL", callRequest.getCodeMdl())
			.put("NUM_WW", callRequest.getNumWw())
			.put("NUM_CHASSIS", callRequest.getNumChassis())
			.put("NUM_IMMAT", callRequest.getNumImmat())
			.put("PRIX_HT", callRequest.getPrixHt())
			.put("QUANTIEME", callRequest.getQuantieme())
			.put("FREQ_AP", callRequest.getFreqAp())
			.put("DATE_EFFET", callRequest.getDateEffet())
			.put("DATE_DER_ECH", callRequest.getDateDerEch())
			.put("DATE_PREM_ECH", callRequest.getDatePremEch())
			.put("MNT_FIN", callRequest.getMntFin())
			.put("MNT_AP", callRequest.getMntAp())
			.put("TX_AP", callRequest.getTxAp())
			.put("PRIX_TTC", callRequest.getPrixTtc())
			.put("TYPE_PAVI", callRequest.getTypePavi())
			.put("ECHEANCE", callRequest.getEcheance())
			.put("VERSSEMENT", callRequest.getVersement())
			.put("GRACE", callRequest.getGrace())
			.put("QT_03", callRequest.getQt03())
			.put("UNITE_GRACE", callRequest.getUniteGrace())
			.put("ID_TIRE", callRequest.getIdTire())
			.put("CPTE_BQ", callRequest.getCpteBcq())
			.put("CHARGE_CLT", callRequest.getChargeClt())
			.put("RIS", callRequest.getRis())
			.put("DOS_COM", callRequest.getDosCom())
			.put("ID_APPORTEUR", callRequest.getIdApporteur())
			.put("ETAT_INST", callRequest.getEtatInst())
			.put("ETAT_ENG", callRequest.getEtatEng())
			.put("ETAT_PROD", callRequest.getEtatProd())
			.put("DUREE", callRequest.getDuree())
			.put("TAUX_NOMINAL", callRequest.getTauxNominal())
			.put("GARANTIE", callRequest.getGuarantie())
			.put("NOOPER", callRequest.getNooper())
			.put("FLAG_CHARGE", callRequest.getFlagCharge())
			.put("DOSS", callRequest.getDoss())
			.put("TEG", callRequest.getTeg())

			.put("PAVI", callRequest.getPavi())
			.put("VR", callRequest.getVr())
			.put("ASS", callRequest.getAss())
			.put("TYPEDOSSIER", callRequest.getTypeDossier())
			.put("FRAIS_DOSS", callRequest.getFraisDoss())
			.put("FRAIS_ASS", callRequest.getFraisAss())
			.put("TYPE_FRAIS", callRequest.getTypeFrais())
			.put("DATE_TRAIT", callRequest.getDateTrait()).toString();
			tracking.setRequestTr(jsonReq);
            os = conn.getOutputStream();
            byte[] postDataBytes = jsonReq.getBytes();
            String result = "";

            os.write(postDataBytes);
            os.flush();

            BufferedReader br = null;
            JSONObject obj = new JSONObject();
			log.info("resp code [{}]", conn.getResponseCode());
			if (conn.getResponseCode() == 200) {
				br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				String ligne = br.readLine();
                while (ligne != null) {
                    result += ligne;
                    ligne = br.readLine();
                }
			}else {
				br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
				String ligne = br.readLine();
                while (ligne != null) {
                    result += ligne;
                    ligne = br.readLine();
                }
				log.info("err [{}]", result);
				response.setCode(ICodeDescResponse.ECHEC_CODE);
				response.setDescription(ICodeDescResponse.ECHEC_DESCRIPTION);
				response.setDateResponse(Instant.now());
				tracking = createTracking(tracking,ICodeDescResponse.ECHEC_CODE, "callDemandeCredit", result, callRequest.toString());
			}
		} catch (Exception e) {
			log.error("in callDemandeCredit [{}]", e);
			tracking = createTracking(tracking,ICodeDescResponse.ECHEC_CODE, "callDemandeCredit",
					ICodeDescResponse.ECHEC_DESCRIPTION, callRequest.toString());
			response.setCode(ICodeDescResponse.ECHEC_CODE);
			response.setDescription(ICodeDescResponse.ECHEC_DESCRIPTION);
			response.setDateResponse(Instant.now());
		}
		trackingService.save(tracking);
		return response;
	}


	public CallFluxResponse callFluxFin(CallFluxRequest callRequest, HttpServletRequest request) {
		Tracking tracking = new Tracking();
		tracking.setDateRequest(Instant.now());
		//Optional<User> user = userService.getUserWithAuthorities();
		//String login = user.isPresent() ? user.get().getLogin() : "";
		CallFluxResponse response = new CallFluxResponse();
		ParamEndPoint endPoint = endPointService.findByCodeParam("callFluxFin");
		if (endPoint == null) {
			// set
			response.setCode(ICodeDescResponse.ECHEC_CODE);
			response.setDescription(ICodeDescResponse.SERVICE_ABSENT_DESC);
			response.setDateResponse(Instant.now());
			tracking = createTracking(tracking, ICodeDescResponse.ECHEC_CODE, "callFluxFin",
					ICodeDescResponse.SERVICE_ABSENT_DESC, callRequest.toString());
			trackingService.save(tracking);
			return response;
		}
		OutputStream os = null;
		try {
			URL url = new URL(endPoint.getEndPoints());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
			//conn.setRequestProperty("Accept", "application/json");
			String jsonReq = new JSONObject()
			.put("NUM_DOSSIER", callRequest.getNumDossier())
			.put("NATURE_FLUX", callRequest.getNatureFlux())
			.put("MNT_FLUX", callRequest.getMntFlux())
			.put("FLAG_FLUX", callRequest.getFlagFlux())
			.put("DATE_FLUX", callRequest.getDateFlux())
			.put("BENEFICIAIRE_FLUX", callRequest.getBeneficiareFlux())
			.put("NAT_BENEF_FLUX", callRequest.getNatBenefFlux())
			.put("MODE_REGLT", callRequest.getModeReglement())
			.put("DATE_GENERATION", callRequest.getDateGeneration())
			.put("NOOPER", callRequest.getNooper())
			.put("DATE_TRAIT", callRequest.getDateTrait())
			.toString();
			tracking.setRequestTr(jsonReq);
            os = conn.getOutputStream();
            byte[] postDataBytes = jsonReq.getBytes();
            String result = "";

            os.write(postDataBytes);
            os.flush();

            BufferedReader br = null;
            JSONObject obj = new JSONObject();
			log.info("resp code [{}]", conn.getResponseCode());
			if (conn.getResponseCode() == 200) {
				br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				String ligne = br.readLine();
                while (ligne != null) {
                    result += ligne;
                    ligne = br.readLine();
                }
			}else {
				br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
				String ligne = br.readLine();
                while (ligne != null) {
                    result += ligne;
                    ligne = br.readLine();
                }
				log.info("err [{}]", result);
				response.setCode(ICodeDescResponse.ECHEC_CODE);
				response.setDescription(ICodeDescResponse.ECHEC_DESCRIPTION);
				response.setDateResponse(Instant.now());
				tracking = createTracking(tracking,ICodeDescResponse.ECHEC_CODE, "callFluxFin", result, callRequest.toString());
			}
			
		} catch (Exception e) {
			log.error("in callFluxFin [{}]", e);
			tracking = createTracking(tracking,ICodeDescResponse.ECHEC_CODE, "callFluxFin",
					ICodeDescResponse.ECHEC_DESCRIPTION, callRequest.toString());
			response.setCode(ICodeDescResponse.ECHEC_CODE);
			response.setDescription(ICodeDescResponse.ECHEC_DESCRIPTION);
			response.setDateResponse(Instant.now());
		}
		trackingService.save(tracking);
		return response;
	}

	public Tracking createTracking(Tracking tracking,String code, String endPoint, String result, String req) {
		//Tracking tracking = new Tracking();
		tracking.setCodeResponse(code);
		tracking.setDateResponse(Instant.now());
		tracking.setEndPointTr(endPoint);
		tracking.setLoginActeur(userService.getUserWithAuthorities().get().getLogin());
		tracking.setResponseTr(result);
		tracking.setRequestTr(req);
		return tracking;
	}

}