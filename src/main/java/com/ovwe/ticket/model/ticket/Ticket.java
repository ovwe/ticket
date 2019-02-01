package com.ovwe.ticket.model.ticket;

public class Ticket {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticket.ticket.uid
     *
     * @mbg.generated Mon Jan 28 09:23:44 CST 2019
     */
    private String uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticket.ticket.train
     *
     * @mbg.generated Mon Jan 28 09:23:44 CST 2019
     */
    private String train;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticket.ticket.carriage
     *
     * @mbg.generated Mon Jan 28 09:23:44 CST 2019
     */
    private Integer carriage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticket.ticket.row_number
     *
     * @mbg.generated Mon Jan 28 09:23:44 CST 2019
     */
    private Integer rowNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticket.ticket.alphabet
     *
     * @mbg.generated Mon Jan 28 09:23:44 CST 2019
     */
    private String alphabet;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticket.ticket.seat
     *
     * @mbg.generated Mon Jan 28 09:23:44 CST 2019
     */
    private String seat;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticket.ticket.uid
     *
     * @return the value of ticket.ticket.uid
     *
     * @mbg.generated Mon Jan 28 09:23:44 CST 2019
     */
    public String getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticket.ticket.uid
     *
     * @param uid the value for ticket.ticket.uid
     *
     * @mbg.generated Mon Jan 28 09:23:44 CST 2019
     */
    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticket.ticket.train
     *
     * @return the value of ticket.ticket.train
     *
     * @mbg.generated Mon Jan 28 09:23:44 CST 2019
     */
    public String getTrain() {
        return train;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticket.ticket.train
     *
     * @param train the value for ticket.ticket.train
     *
     * @mbg.generated Mon Jan 28 09:23:44 CST 2019
     */
    public void setTrain(String train) {
        this.train = train == null ? null : train.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticket.ticket.carriage
     *
     * @return the value of ticket.ticket.carriage
     *
     * @mbg.generated Mon Jan 28 09:23:44 CST 2019
     */
    public Integer getCarriage() {
        return carriage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticket.ticket.carriage
     *
     * @param carriage the value for ticket.ticket.carriage
     *
     * @mbg.generated Mon Jan 28 09:23:44 CST 2019
     */
    public void setCarriage(Integer carriage) {
        this.carriage = carriage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticket.ticket.row_number
     *
     * @return the value of ticket.ticket.row_number
     *
     * @mbg.generated Mon Jan 28 09:23:44 CST 2019
     */
    public Integer getRowNumber() {
        return rowNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticket.ticket.row_number
     *
     * @param rowNumber the value for ticket.ticket.row_number
     *
     * @mbg.generated Mon Jan 28 09:23:44 CST 2019
     */
    public void setRowNumber(Integer rowNumber) {
        this.rowNumber = rowNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticket.ticket.alphabet
     *
     * @return the value of ticket.ticket.alphabet
     *
     * @mbg.generated Mon Jan 28 09:23:44 CST 2019
     */
    public String getAlphabet() {
        return alphabet;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticket.ticket.alphabet
     *
     * @param alphabet the value for ticket.ticket.alphabet
     *
     * @mbg.generated Mon Jan 28 09:23:44 CST 2019
     */
    public void setAlphabet(String alphabet) {
        this.alphabet = alphabet == null ? null : alphabet.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticket.ticket.seat
     *
     * @return the value of ticket.ticket.seat
     *
     * @mbg.generated Mon Jan 28 09:23:44 CST 2019
     */
    public String getSeat() {
        return seat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticket.ticket.seat
     *
     * @param seat the value for ticket.ticket.seat
     *
     * @mbg.generated Mon Jan 28 09:23:44 CST 2019
     */
    public void setSeat(String seat) {
        this.seat = seat == null ? null : seat.trim();
    }
}