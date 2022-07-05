package com.example.simplenotes;

public class Notes {
    private String TITLE;
    private String SUB_TITLE;
    private String DESCRIPTION;
    private String DATE;

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    public String getSUB_TITLE() {
        return SUB_TITLE;
    }

    public void setSUB_TITLE(String SUB_TITLE) {
        this.SUB_TITLE = SUB_TITLE;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    public String getDATE() {
        return DATE;
    }

    public void setDATE(String DATE) {
        this.DATE = DATE;
    }
}
