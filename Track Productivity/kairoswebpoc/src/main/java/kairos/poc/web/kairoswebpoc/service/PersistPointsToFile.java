package kairos.poc.web.kairoswebpoc.service;

import kairos.poc.web.kairoswebpoc.pojo.Points;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Stack;


public class PersistPointsToFile {
    private Stack<String> logPersistTimeStamp = new Stack<>();
    public static void main(String[] args) {
        //// TODO: 9/12/18 Proof of concept dev here
    }
    public void persistPointsIntoTextFile(List<Points> listOfPointDetails){
        System.out.println("Mock persisting "+listOfPointDetails.size()+" into file....");
        logPersistTimeStamp.add(new Date().toString());
        System.out.println("Mock persisting into file completed. Logged time " + logPersistTimeStamp.peek());
    }
}
