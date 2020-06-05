package com.boa.api.request;

public class CallFluxRequest {
    private String numDossier, natureFlux, flagFlux, beneficiareFlux, natBenefFlux;
    private Double mntFlux; 		
 	private String modeReglement, nooper;		
 	private String dateFlux, dateGeneration, dateTrait; 		

    public CallFluxRequest() {
    }

    public CallFluxRequest(String numDossier, String natureFlux, String flagFlux, String beneficiareFlux, String natBenefFlux, Double mntFlux, String modeReglement, String nooper, String dateFlux, String dateGeneration, String dateTrait) {
        this.numDossier = numDossier;
        this.natureFlux = natureFlux;
        this.flagFlux = flagFlux;
        this.beneficiareFlux = beneficiareFlux;
        this.natBenefFlux = natBenefFlux;
        this.mntFlux = mntFlux;
        this.modeReglement = modeReglement;
        this.nooper = nooper;
        this.dateFlux = dateFlux;
        this.dateGeneration = dateGeneration;
        this.dateTrait = dateTrait;
    }

    public String getNumDossier() {
        return this.numDossier;
    }

    public void setNumDossier(String numDossier) {
        this.numDossier = numDossier;
    }

    public String getNatureFlux() {
        return this.natureFlux;
    }

    public void setNatureFlux(String natureFlux) {
        this.natureFlux = natureFlux;
    }

    public String getFlagFlux() {
        return this.flagFlux;
    }

    public void setFlagFlux(String flagFlux) {
        this.flagFlux = flagFlux;
    }

    public String getBeneficiareFlux() {
        return this.beneficiareFlux;
    }

    public void setBeneficiareFlux(String beneficiareFlux) {
        this.beneficiareFlux = beneficiareFlux;
    }

    public String getNatBenefFlux() {
        return this.natBenefFlux;
    }

    public void setNatBenefFlux(String natBenefFlux) {
        this.natBenefFlux = natBenefFlux;
    }

    public Double getMntFlux() {
        return this.mntFlux;
    }

    public void setMntFlux(Double mntFlux) {
        this.mntFlux = mntFlux;
    }

    public String getModeReglement() {
        return this.modeReglement;
    }

    public void setModeReglement(String modeReglement) {
        this.modeReglement = modeReglement;
    }

    public String getNooper() {
        return this.nooper;
    }

    public void setNooper(String nooper) {
        this.nooper = nooper;
    }

    public String getDateFlux() {
        return this.dateFlux;
    }

    public void setDateFlux(String dateFlux) {
        this.dateFlux = dateFlux;
    }

    public String getDateGeneration() {
        return this.dateGeneration;
    }

    public void setDateGeneration(String dateGeneration) {
        this.dateGeneration = dateGeneration;
    }

    public String getDateTrait() {
        return this.dateTrait;
    }

    public void setDateTrait(String dateTrait) {
        this.dateTrait = dateTrait;
    }

    public CallFluxRequest numDossier(String numDossier) {
        this.numDossier = numDossier;
        return this;
    }

    public CallFluxRequest natureFlux(String natureFlux) {
        this.natureFlux = natureFlux;
        return this;
    }

    public CallFluxRequest flagFlux(String flagFlux) {
        this.flagFlux = flagFlux;
        return this;
    }

    public CallFluxRequest beneficiareFlux(String beneficiareFlux) {
        this.beneficiareFlux = beneficiareFlux;
        return this;
    }

    public CallFluxRequest natBenefFlux(String natBenefFlux) {
        this.natBenefFlux = natBenefFlux;
        return this;
    }

    public CallFluxRequest mntFlux(Double mntFlux) {
        this.mntFlux = mntFlux;
        return this;
    }

    public CallFluxRequest modeReglement(String modeReglement) {
        this.modeReglement = modeReglement;
        return this;
    }

    public CallFluxRequest nooper(String nooper) {
        this.nooper = nooper;
        return this;
    }

    public CallFluxRequest dateFlux(String dateFlux) {
        this.dateFlux = dateFlux;
        return this;
    }

    public CallFluxRequest dateGeneration(String dateGeneration) {
        this.dateGeneration = dateGeneration;
        return this;
    }

    public CallFluxRequest dateTrait(String dateTrait) {
        this.dateTrait = dateTrait;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " numDossier='" + getNumDossier() + "'" +
            ", natureFlux='" + getNatureFlux() + "'" +
            ", flagFlux='" + getFlagFlux() + "'" +
            ", beneficiareFlux='" + getBeneficiareFlux() + "'" +
            ", natBenefFlux='" + getNatBenefFlux() + "'" +
            ", mntFlux='" + getMntFlux() + "'" +
            ", modeReglement='" + getModeReglement() + "'" +
            ", nooper='" + getNooper() + "'" +
            ", dateFlux='" + getDateFlux() + "'" +
            ", dateGeneration='" + getDateGeneration() + "'" +
            ", dateTrait='" + getDateTrait() + "'" +
            "}";
    }

}