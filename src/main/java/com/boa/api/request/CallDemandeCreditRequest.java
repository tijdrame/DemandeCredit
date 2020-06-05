package com.boa.api.request;

public class CallDemandeCreditRequest {
    private String codeMrk, codeMdl, numWw, numChassis, numImmat, guarantie;
    private Double prixHt, prixTtc, txAp, mntAp, mntFin;
    private String datePremEch, dateDerEch, dateEffet, dateTrait;
    private String freqAp, quantieme, uniteGrace, idTire, cpteBcq;
    private Integer grace, duree, tauxNominal, typePavi, typeFrais;
    private String chargeClt, ris, dosCom, idApporteur, etatInst, etatEng, etatProd;
    private String nooper, typeDossier, versement, qt03, flagCharge, doss, teg, vr, ass;
    private Double fraisDoss, fraisAss, pavi, echeance;
	

    public CallDemandeCreditRequest() {
    }

    public CallDemandeCreditRequest(String codeMrk, String codeMdl, String numWw, String numChassis, 
    String numImmat, Double prixHt, Double prixTtc, Double txAp, Double mntAp, Double mntFin,
    String datePremEch, String dateDerEch, String dateEffet, String dateTrait, String freqAp,
    String quantieme, String uniteGrace, String idTire, String cpteBcq, Integer grace, Integer duree, 
    Integer tauxNominal, Integer typePavi, String chargeClt, String ris, String dosCom, 
    String idApporteur, String etatInst, String etatEng, String etatProd, String nooper, 
    String typeDossier, Double fraisDoss, Double fraisAss, Double pavi, Double echeance) {
        this.codeMrk = codeMrk;
        this.codeMdl = codeMdl;
        this.numWw = numWw;
        this.numChassis = numChassis;
        this.numImmat = numImmat;
        this.prixHt = prixHt;
        this.prixTtc = prixTtc;
        this.txAp = txAp;
        this.mntAp = mntAp;
        this.mntFin = mntFin;
        this.datePremEch = datePremEch;
        this.dateDerEch = dateDerEch;
        this.dateEffet = dateEffet;
        this.dateTrait = dateTrait;
        this.freqAp = freqAp;
        this.quantieme = quantieme;
        this.uniteGrace = uniteGrace;
        this.idTire = idTire;
        this.cpteBcq = cpteBcq;
        this.grace = grace;
        this.duree = duree;
        this.tauxNominal = tauxNominal;
        this.typePavi = typePavi;
        this.chargeClt = chargeClt;
        this.ris = ris;
        this.dosCom = dosCom;
        this.idApporteur = idApporteur;
        this.etatInst = etatInst;
        this.etatEng = etatEng;
        this.etatProd = etatProd;
        this.nooper = nooper;
        this.typeDossier = typeDossier;
        this.fraisDoss = fraisDoss;
        this.fraisAss = fraisAss;
        this.pavi = pavi;
        this.echeance = echeance;
    }

    public String getGuarantie() {
        return this.guarantie;
    }

    public void setGuarantie(String guarantie) {
        this.guarantie = guarantie;
    }

    public String getCodeMrk() {
        return this.codeMrk;
    }

    public void setCodeMrk(String codeMrk) {
        this.codeMrk = codeMrk;
    }

    public String getCodeMdl() {
        return this.codeMdl;
    }

    public void setCodeMdl(String codeMdl) {
        this.codeMdl = codeMdl;
    }

    public String getNumWw() {
        return this.numWw;
    }

    public void setNumWw(String numWw) {
        this.numWw = numWw;
    }

    public String getNumChassis() {
        return this.numChassis;
    }

    public void setNumChassis(String numChassis) {
        this.numChassis = numChassis;
    }

    public String getNumImmat() {
        return this.numImmat;
    }

    public void setNumImmat(String numImmat) {
        this.numImmat = numImmat;
    }

    public Double getPrixHt() {
        return this.prixHt;
    }

    public void setPrixHt(Double prixHt) {
        this.prixHt = prixHt;
    }

    public Double getPrixTtc() {
        return this.prixTtc;
    }

    public void setPrixTtc(Double prixTtc) {
        this.prixTtc = prixTtc;
    }

    public Double getTxAp() {
        return this.txAp;
    }

    public void setTxAp(Double txAp) {
        this.txAp = txAp;
    }

    public Double getMntAp() {
        return this.mntAp;
    }

    public void setMntAp(Double mntAp) {
        this.mntAp = mntAp;
    }

    public Double getMntFin() {
        return this.mntFin;
    }

    public void setMntFin(Double mntFin) {
        this.mntFin = mntFin;
    }

    public String getDatePremEch() {
        return this.datePremEch;
    }

    public void setDatePremEch(String datePremEch) {
        this.datePremEch = datePremEch;
    }

    public String getDateDerEch() {
        return this.dateDerEch;
    }

    public void setDateDerEch(String dateDerEch) {
        this.dateDerEch = dateDerEch;
    }

    public String getDateEffet() {
        return this.dateEffet;
    }

    public void setDateEffet(String dateEffet) {
        this.dateEffet = dateEffet;
    }

    public String getDateTrait() {
        return this.dateTrait;
    }

    public void setDateTrait(String dateTrait) {
        this.dateTrait = dateTrait;
    }

    public String getFreqAp() {
        return this.freqAp;
    }

    public void setFreqAp(String freqAp) {
        this.freqAp = freqAp;
    }

    public String getQuantieme() {
        return this.quantieme;
    }

    public void setQuantieme(String quantieme) {
        this.quantieme = quantieme;
    }

    public String getUniteGrace() {
        return this.uniteGrace;
    }

    public void setUniteGrace(String uniteGrace) {
        this.uniteGrace = uniteGrace;
    }

    public String getIdTire() {
        return this.idTire;
    }

    public void setIdTire(String idTire) {
        this.idTire = idTire;
    }

    public String getCpteBcq() {
        return this.cpteBcq;
    }

    public void setCpteBcq(String cpteBcq) {
        this.cpteBcq = cpteBcq;
    }

    public Integer getGrace() {
        return this.grace;
    }

    public void setGrace(Integer grace) {
        this.grace = grace;
    }

    public Integer getDuree() {
        return this.duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }

    public Integer getTauxNominal() {
        return this.tauxNominal;
    }

    public void setTauxNominal(Integer tauxNominal) {
        this.tauxNominal = tauxNominal;
    }

    public Integer getTypePavi() {
        return this.typePavi;
    }

    public void setTypePavi(Integer typePavi) {
        this.typePavi = typePavi;
    }

    public String getChargeClt() {
        return this.chargeClt;
    }

    public void setChargeClt(String chargeClt) {
        this.chargeClt = chargeClt;
    }

    public String getRis() {
        return this.ris;
    }

    public void setRis(String ris) {
        this.ris = ris;
    }

    public String getDosCom() {
        return this.dosCom;
    }

    public void setDosCom(String dosCom) {
        this.dosCom = dosCom;
    }

    public String getIdApporteur() {
        return this.idApporteur;
    }

    public void setIdApporteur(String idApporteur) {
        this.idApporteur = idApporteur;
    }

    public String getEtatInst() {
        return this.etatInst;
    }

    public void setEtatInst(String etatInst) {
        this.etatInst = etatInst;
    }

    public String getEtatEng() {
        return this.etatEng;
    }

    public void setEtatEng(String etatEng) {
        this.etatEng = etatEng;
    }

    public String getEtatProd() {
        return this.etatProd;
    }

    public void setEtatProd(String etatProd) {
        this.etatProd = etatProd;
    }

    public String getNooper() {
        return this.nooper;
    }

    public void setNooper(String nooper) {
        this.nooper = nooper;
    }

    public String getTypeDossier() {
        return this.typeDossier;
    }

    public void setTypeDossier(String typeDossier) {
        this.typeDossier = typeDossier;
    }

    public Double getFraisDoss() {
        return this.fraisDoss;
    }

    public void setFraisDoss(Double fraisDoss) {
        this.fraisDoss = fraisDoss;
    }

    public Double getFraisAss() {
        return this.fraisAss;
    }

    public void setFraisAss(Double fraisAss) {
        this.fraisAss = fraisAss;
    }

    public Double getPavi() {
        return this.pavi;
    }

    public void setPavi(Double pavi) {
        this.pavi = pavi;
    }

    public Double getEcheance() {
        return this.echeance;
    }

    public void setEcheance(Double echeance) {
        this.echeance = echeance;
    }

    public CallDemandeCreditRequest codeMrk(String codeMrk) {
        this.codeMrk = codeMrk;
        return this;
    }

    public CallDemandeCreditRequest codeMdl(String codeMdl) {
        this.codeMdl = codeMdl;
        return this;
    }

    public CallDemandeCreditRequest numWw(String numWw) {
        this.numWw = numWw;
        return this;
    }

    public CallDemandeCreditRequest numChassis(String numChassis) {
        this.numChassis = numChassis;
        return this;
    }

    public CallDemandeCreditRequest numImmat(String numImmat) {
        this.numImmat = numImmat;
        return this;
    }

    public CallDemandeCreditRequest prixHt(Double prixHt) {
        this.prixHt = prixHt;
        return this;
    }

    public CallDemandeCreditRequest prixTtc(Double prixTtc) {
        this.prixTtc = prixTtc;
        return this;
    }

    public CallDemandeCreditRequest txAp(Double txAp) {
        this.txAp = txAp;
        return this;
    }

    public CallDemandeCreditRequest mntAp(Double mntAp) {
        this.mntAp = mntAp;
        return this;
    }

    public CallDemandeCreditRequest mntFin(Double mntFin) {
        this.mntFin = mntFin;
        return this;
    }

    public CallDemandeCreditRequest datePremEch(String datePremEch) {
        this.datePremEch = datePremEch;
        return this;
    }

    public CallDemandeCreditRequest dateDerEch(String dateDerEch) {
        this.dateDerEch = dateDerEch;
        return this;
    }

    public CallDemandeCreditRequest dateEffet(String dateEffet) {
        this.dateEffet = dateEffet;
        return this;
    }

    public CallDemandeCreditRequest dateTrait(String dateTrait) {
        this.dateTrait = dateTrait;
        return this;
    }

    public CallDemandeCreditRequest freqAp(String freqAp) {
        this.freqAp = freqAp;
        return this;
    }

    public CallDemandeCreditRequest quantieme(String quantieme) {
        this.quantieme = quantieme;
        return this;
    }

    public CallDemandeCreditRequest uniteGrace(String uniteGrace) {
        this.uniteGrace = uniteGrace;
        return this;
    }

    public CallDemandeCreditRequest idTire(String idTire) {
        this.idTire = idTire;
        return this;
    }

    public CallDemandeCreditRequest cpteBcq(String cpteBcq) {
        this.cpteBcq = cpteBcq;
        return this;
    }

    public CallDemandeCreditRequest grace(Integer grace) {
        this.grace = grace;
        return this;
    }

    public CallDemandeCreditRequest duree(Integer duree) {
        this.duree = duree;
        return this;
    }

    public CallDemandeCreditRequest tauxNominal(Integer tauxNominal) {
        this.tauxNominal = tauxNominal;
        return this;
    }

    public CallDemandeCreditRequest typePavi(Integer typePavi) {
        this.typePavi = typePavi;
        return this;
    }

    public CallDemandeCreditRequest chargeClt(String chargeClt) {
        this.chargeClt = chargeClt;
        return this;
    }

    public CallDemandeCreditRequest ris(String ris) {
        this.ris = ris;
        return this;
    }

    public CallDemandeCreditRequest dosCom(String dosCom) {
        this.dosCom = dosCom;
        return this;
    }

    public CallDemandeCreditRequest idApporteur(String idApporteur) {
        this.idApporteur = idApporteur;
        return this;
    }

    public CallDemandeCreditRequest etatInst(String etatInst) {
        this.etatInst = etatInst;
        return this;
    }

    public CallDemandeCreditRequest etatEng(String etatEng) {
        this.etatEng = etatEng;
        return this;
    }

    public CallDemandeCreditRequest etatProd(String etatProd) {
        this.etatProd = etatProd;
        return this;
    }

    public CallDemandeCreditRequest nooper(String nooper) {
        this.nooper = nooper;
        return this;
    }

    public CallDemandeCreditRequest typeDossier(String typeDossier) {
        this.typeDossier = typeDossier;
        return this;
    }

    public CallDemandeCreditRequest fraisDoss(Double fraisDoss) {
        this.fraisDoss = fraisDoss;
        return this;
    }

    public CallDemandeCreditRequest fraisAss(Double fraisAss) {
        this.fraisAss = fraisAss;
        return this;
    }

    public CallDemandeCreditRequest pavi(Double pavi) {
        this.pavi = pavi;
        return this;
    }

    public CallDemandeCreditRequest echeance(Double echeance) {
        this.echeance = echeance;
        return this;
    }

    public String getVersement() {
        return this.versement;
    }

    public void setVersement(String versement) {
        this.versement = versement;
    }

    public Integer getTypeFrais() {
        return this.typeFrais;
    }

    public void setTypeFrais(Integer typeFrais) {
        this.typeFrais = typeFrais;
    }

    public String getQt03() {
        return this.qt03;
    }

    public void setQt03(String qt03) {
        this.qt03 = qt03;
    }

    public String getFlagCharge() {
        return this.flagCharge;
    }

    public void setFlagCharge(String flagCharge) {
        this.flagCharge = flagCharge;
    }

    public String getDoss() {
        return this.doss;
    }

    public void setDoss(String doss) {
        this.doss = doss;
    }

    public String getTeg() {
        return this.teg;
    }

    public void setTeg(String teg) {
        this.teg = teg;
    }

    public String getVr() {
        return this.vr;
    }

    public void setVr(String vr) {
        this.vr = vr;
    }

    public String getAss() {
        return this.ass;
    }

    public void setAss(String ass) {
        this.ass = ass;
    }

    @Override
    public String toString() {
        return "{" +
            " codeMrk='" + getCodeMrk() + "'" +
            ", codeMdl='" + getCodeMdl() + "'" +
            ", numWw='" + getNumWw() + "'" +
            ", numChassis='" + getNumChassis() + "'" +
            ", numImmat='" + getNumImmat() + "'" +
            ", prixHt='" + getPrixHt() + "'" +
            ", prixTtc='" + getPrixTtc() + "'" +
            ", txAp='" + getTxAp() + "'" +
            ", mntAp='" + getMntAp() + "'" +
            ", mntFin='" + getMntFin() + "'" +
            ", datePremEch='" + getDatePremEch() + "'" +
            ", dateDerEch='" + getDateDerEch() + "'" +
            ", dateEffet='" + getDateEffet() + "'" +
            ", dateTrait='" + getDateTrait() + "'" +
            ", freqAp='" + getFreqAp() + "'" +
            ", quantieme='" + getQuantieme() + "'" +
            ", uniteGrace='" + getUniteGrace() + "'" +
            ", idTire='" + getIdTire() + "'" +
            ", cpteBcq='" + getCpteBcq() + "'" +
            ", grace='" + getGrace() + "'" +
            ", duree='" + getDuree() + "'" +
            ", tauxNominal='" + getTauxNominal() + "'" +
            ", typePavi='" + getTypePavi() + "'" +
            ", chargeClt='" + getChargeClt() + "'" +
            ", ris='" + getRis() + "'" +
            ", dosCom='" + getDosCom() + "'" +
            ", idApporteur='" + getIdApporteur() + "'" +
            ", etatInst='" + getEtatInst() + "'" +
            ", etatEng='" + getEtatEng() + "'" +
            ", etatProd='" + getEtatProd() + "'" +
            ", nooper='" + getNooper() + "'" +
            ", typeDossier='" + getTypeDossier() + "'" +
            ", fraisDoss='" + getFraisDoss() + "'" +
            ", fraisAss='" + getFraisAss() + "'" +
            ", pavi='" + getPavi() + "'" +
            ", echeance='" + getEcheance() + "'" +
            "}";
    }

   
}