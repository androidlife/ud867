package com.joke.smith;

import java.util.*;
public class JokeSmith{

   public ArrayList<String> tellJokes(){
      ArrayList<String> jokes = new ArrayList<String>(){{
         add("This is first joke");
         add("This is second joke");
         add("This is third joke");
         add("This is fourth joke");
     }};
      return jokes;
   }
}
