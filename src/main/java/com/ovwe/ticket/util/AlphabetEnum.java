package com.ovwe.ticket.util;

public enum AlphabetEnum {
    A("A座", 1), B("B座", 2), C("C座", 3), E("E座", 4), F("F座", 5);
    private String alphabet;
    private int index;
    AlphabetEnum(String alphabet, int index) {
        this.setAlphabet(alphabet);
        this.setIndex(index);
    }

    public static AlphabetEnum fromIndex(int index) {
        for (AlphabetEnum alphabetEnum : AlphabetEnum.values()) {
            if (alphabetEnum.getIndex() == index) {
                return alphabetEnum;
            }
        }
        return null;
    }

    public String getAlphabet() {
        return alphabet;
    }

    public void setAlphabet(String alphabet) {
        this.alphabet = alphabet;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
