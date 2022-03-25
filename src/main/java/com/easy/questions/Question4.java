package com.easy.questions;

/*Tournament Winner
There's an algorithms tournament taking place in which teams of programmers compete
against each other to solve algorithmic problems as fast as possible. Teams compete in a
round robin, where each team faces off against all other teams. Only two teams compete
against each other at a time, and for each competition, one team is designated the home
team, while the other team is the away team. In each competition there's always one winner
and one loser; there are no ties. A team receives 3 points if it wins and 0 points if it loses. The
winner of the tournament is the team that receives the most amount of points.
Given an array of pairs representing the teams that have competed against each other and
an array containing the results of each competition, write a function that returns the winner
of the tournament. The input arrays are named competitions and results ,
respectively. The competitions array has elements in the form of
[homeTeam, awayTeam] , where each team is a string of at most 30 characters
representing the name of the team. The results array contains information about the
winner of each corresponding competition in the competitions array. Specifically,
results[i] denotes the winner of competitions[i] , where a 1 in the results
array means that the home team in the corresponding competition won and a 0 means
that the away team won.
It's guaranteed that exactly one team will win the tournament and that each team will
compete against all other teams exactly once. It's also guaranteed that the tournament will
always have at least two teams.
Sample Input
competitions = [
 ["HTML", "C#"],
 ["C#", "Python"],
 ["Python", "HTML"],
]
results = [0, 0, 1]
Sample Output
"Python"
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question4 {

    public String tournamentWinner(List<List<String>> competitions, List<Integer> results) {
        // result =0 ---> away team winner, result=1 ----> home team winner
        // competition ----> competition[0]-------> home team, competition[1]----> away team

        Map<String, Integer> playersMap = new HashMap<>();

        for (int i = 0; i < results.size(); i++) {
            List<String> competition = competitions.get(i);
            if (results.get(i) == 0) {

                if (playersMap.containsKey(competition.get(1))) {
                    playersMap.put(competition.get(1), playersMap.get(competition.get(1)) + 1);
                } else {
                    playersMap.put(competition.get(1), 1);
                }

            } else {
                if (playersMap.containsKey(competition.get(0))) {
                    playersMap.put(competition.get(0), playersMap.get(competition.get(0)) + 1);
                } else {
                    playersMap.put(competition.get(0), 1);
                }
            }

        }


        return playersMap.entrySet().stream().reduce((e1, e2) -> e1.getValue() > e2.getValue() ? e1 : e2).get().getKey();
    }
}
