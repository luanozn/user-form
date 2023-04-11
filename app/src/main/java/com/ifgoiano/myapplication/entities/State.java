package com.ifgoiano.myapplication.entities;

public enum State {
    GOIAS("GO"),
    MINAS_GERAIS("MG"),
    MATO_GROSSO("MT"),
    SAO_PAULO("SP"),
    RIO_DE_JANEIRO("RJ"),
    UNDEFINED("undefined");

    private final String shortcut;

    State(String shortcut) {
        this.shortcut = shortcut;
    }

    public static State from(String state) {
        switch (state) {
            case "Goiás" : return GOIAS;
            case "Minas Gerais" : return MINAS_GERAIS;
            case "Mato Grosso" : return MATO_GROSSO;
            case "São Paulo": return SAO_PAULO;
            case "Rio de Janeiro": return RIO_DE_JANEIRO;
            default: return UNDEFINED;
        }
    }

    public String getShortcut() {
        return shortcut;
    }
}
