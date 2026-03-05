package StrategyPattern;

abstract class Card {
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private String cvv;
    
    Card(String cardNumber, String cardHolderName, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    public String getMaskedCardNumber() {
        return cardNumber.substring(0,3)+" **** **** " + cardNumber.substring(cardNumber.length() - 4);
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getCvv() {
        return cvv;
    }
}