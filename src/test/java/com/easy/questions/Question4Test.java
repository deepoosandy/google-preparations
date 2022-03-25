package com.easy.questions;

import com.easy.questions.model.test4.com.Test4.Example;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import utils.CustomFileReader;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class Question4Test {

    private final Question4 question4= new Question4();

    @Test
    public void test1() throws IOException {
          ObjectMapper mapper= new ObjectMapper();
        Example inputObject=mapper.readValue(CustomFileReader.fileReader("src//test//resources//test4//input1.json"), Example.class);
        assertEquals("Python",question4.tournamentWinner(inputObject.getCompetitions(),inputObject.getResults()));
    }

    @Test
    public void test2() throws IOException {
        ObjectMapper mapper= new ObjectMapper();
        Example inputObject=mapper.readValue(CustomFileReader.fileReader("src//test//resources//test4//input2.json"), Example.class);
        assertEquals("Java",question4.tournamentWinner(inputObject.getCompetitions(),inputObject.getResults()));
    }
    @Test
    public void test3() throws IOException {
        ObjectMapper mapper= new ObjectMapper();
        Example inputObject=mapper.readValue(CustomFileReader.fileReader("src//test//resources//test4//input3.json"), Example.class);
        assertEquals("C#",question4.tournamentWinner(inputObject.getCompetitions(),inputObject.getResults()));
    }
    @Test
    public void test4() throws IOException {
        ObjectMapper mapper= new ObjectMapper();
        Example inputObject=mapper.readValue(CustomFileReader.fileReader("src//test//resources//test4//input4.json"), Example.class);
        assertEquals("C#",question4.tournamentWinner(inputObject.getCompetitions(),inputObject.getResults()));
    }
    @Test
    public void test5() throws IOException {
        ObjectMapper mapper= new ObjectMapper();
        Example inputObject=mapper.readValue(CustomFileReader.fileReader("src//test//resources//test4//input5.json"), Example.class);
        assertEquals("Bulls",question4.tournamentWinner(inputObject.getCompetitions(),inputObject.getResults()));
    }
    @Test
    public void test6() throws IOException {
        ObjectMapper mapper= new ObjectMapper();
        Example inputObject=mapper.readValue(CustomFileReader.fileReader("src//test//resources//test4//input6.json"), Example.class);
        assertEquals("Eagles",question4.tournamentWinner(inputObject.getCompetitions(),inputObject.getResults()));
    } @Test
    public void test7() throws IOException {
        ObjectMapper mapper= new ObjectMapper();
        Example inputObject=mapper.readValue(CustomFileReader.fileReader("src//test//resources//test4//input7.json"), Example.class);
        assertEquals("Bulls",question4.tournamentWinner(inputObject.getCompetitions(),inputObject.getResults()));
    } @Test
    public void test8() throws IOException {
        ObjectMapper mapper= new ObjectMapper();
        Example inputObject=mapper.readValue(CustomFileReader.fileReader("src//test//resources//test4//input8.json"), Example.class);
        assertEquals("AlgoMasters",question4.tournamentWinner(inputObject.getCompetitions(),inputObject.getResults()));
    }
    @Test
    public void test9() throws IOException {
        ObjectMapper mapper= new ObjectMapper();
        Example inputObject=mapper.readValue(CustomFileReader.fileReader("src//test//resources//test4//input9.json"), Example.class);
        assertEquals("SQL",question4.tournamentWinner(inputObject.getCompetitions(),inputObject.getResults()));
    }
    @Test
    public void test10() throws IOException {
        ObjectMapper mapper= new ObjectMapper();
        Example inputObject=mapper.readValue(CustomFileReader.fileReader("src//test//resources//test4//input10.json"), Example.class);
        assertEquals("B",question4.tournamentWinner(inputObject.getCompetitions(),inputObject.getResults()));
    }





}