package org.user;

public enum Document {
    MONTHLY_REPORT("Reporte Mensual"),
    PARTIAL_REPORT("Reporte Parcial"),
    SCHEDULE("Cronograma"),
    ASSIGNMENT_OFFICE("Oficio de Asignacion"),
    ACCEPTANCE_OFFICE("Oficio de Aceptacion"),
    SELF_APPRAISAL("Autoevaluacion"),
    COMPANY_EVALUATION("Evaluacion Empresa");
    private String document;

    Document(String document){
        this.document = document;
    }

    public String getDocument(){
        return document;
    }

}
