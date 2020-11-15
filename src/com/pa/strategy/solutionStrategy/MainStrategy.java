package com.pa.strategy.solutionStrategy;

/*
 *@author patriciamacedo
 */
public class MainStrategy {

    public static void main(String[] args) {

        Programmer p1= new Programmer(1, "Ana",5,2);
        Programmer p2= new Programmer(2, "Rui",15,8);
        Programmer p3= new Programmer(3, "Paula",22,9);
        Programmer p4= new Programmer(4, "Luis",5,6);
        Group gr1 = new Group("PA-23", new StrategyDiversity());
        gr1.addMember(p1,p2,p3,p4);
        System.out.printf("\nGrupo %s , GlobalIndex- %f", gr1.toString(),gr1.calculateGlobalIndex());
        gr1.setStrategy(new StrategyMultiSkill());
        System.out.printf("\nGrupo %s , GlobalIndex- %f", gr1.toString(),gr1.calculateGlobalIndex());
        gr1.setStrategy(new StrategySenior());
        System.out.printf("\nGrupo %s , GlobalIndex- %f", gr1.toString(),gr1.calculateGlobalIndex());


    }
}
