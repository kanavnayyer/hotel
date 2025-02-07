/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Whatsapp;

import java.util.ArrayList;

/**
 *
 * @author kanav
 */

/* Mark: StatusService
description :  stores status 

*/
public class StatusService {

    private ArrayList<Status> statuses;

    public StatusService() {
        statuses = new ArrayList<>();
    }

    public void addStatus(Status status) {
        statuses.add(status);
    }

    public ArrayList<Status> getStatuses() {
        return statuses;
    }

    @Override
    public String toString() {
        return "StatusService{" + "statuses=" + statuses + '}';
    }

}
