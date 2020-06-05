package com.boa.api.web.rest;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.boa.api.request.CallDemandeCreditRequest;
import com.boa.api.request.CallFluxRequest;
import com.boa.api.response.CallDemandeCreditResponse;
import com.boa.api.response.CallFluxResponse;
import com.boa.api.response.CheckFactoryRequest;
import com.boa.api.service.ApiService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.swagger.annotations.Api;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("/api")
@Api(description = "Web Service pour prendre en compte les demandes de crédits", tags = "Asset Finance Service.")
public class ApiResource {

    private final Logger log = LoggerFactory.getLogger(this.getClass());
    private final ApiService apiService;
    private final WebClient.Builder webClient;

    public ApiResource(ApiService apiService, WebClient.Builder webClient){
        this.apiService = apiService;
        this.webClient = webClient;
    }

    @PostMapping("/checkFactCnss")
    @ApiIgnore
    public void testWebClient(){
        CheckFactoryRequest checkFactoryRequest = new CheckFactoryRequest();
        /*webClient.build().post().uri("http://localhost:8888/checkFactCnss")
        .bodyValue(checkFactoryRequest)
        .retrieve()
        .bodyToMono(CheckFactoryRequest.class)
        .block();*/
        Map<String, String> uriVariables = new HashMap<>();
        //uriVariables.put("key", value)
		ResponseEntity <CheckFactoryRequest> resp = new RestTemplate().postForEntity("http://localhost:8888/checkFactCnss", 
        null, CheckFactoryRequest.class, uriVariables);
        log.info("resppp====[{}]", checkFactoryRequest);
        log.info("resppp====[{}]", resp);

    }

    @PostMapping("/callDemandeCredit")
    public ResponseEntity<CallDemandeCreditResponse> callDemandeCredit
    (@RequestBody CallDemandeCreditRequest callRequest,
     HttpServletRequest request) {
        log.debug("REST request to getCards : {}", callRequest);
        CallDemandeCreditResponse response = new CallDemandeCreditResponse();
        response = apiService.callDemandeCredit(callRequest, request);
        return ResponseEntity.ok().header("Authorization", request.getHeader("Authorization")).body(response);
    }

    @PostMapping("/callFluxFin")
    public ResponseEntity<CallFluxResponse> callFluxFin(@RequestBody CallFluxRequest callRequest,
     HttpServletRequest request) {
        log.debug("REST request to getCards : {}", callRequest);
        CallFluxResponse response = new CallFluxResponse();
        response = apiService.callFluxFin(callRequest, request);
        return ResponseEntity.ok().header("Authorization", request.getHeader("Authorization")).body(response);
    }
    
}