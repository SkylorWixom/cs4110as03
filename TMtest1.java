public class TMtest1 {
    
    public static void main(String[] args){
        //A TM for alphabet {a,b} that recognizes the language consisting of all words that contain the substring bbb.
        //Test your program with the following input strings: abba,  abbba,  bbababb,  babbbb,  aaabbb
        
        //State transition instructions
        String[] C =
        {
            "0,a=>a,R,0", // start: read a, write a, move tape head right, go to state 0
            "0,b=>b,R,1", // start: read b, write b, move tape head right, go to state 1
            "1,b=>b,R,2", // state1: read b, write b, move tape head right, go to state 2
            "1,a=>a,R,0", // state1: read a, write a, move tape head right, go to state 0
            "2,b=>b,R,3", // state2: read b, write b, move tape head right, go to state 3
            "2,a=>a,R,0", // state2: read a, write a, move tape head right, go to state 0
            "3,a=>a,R,3", // state3: read a, write a, move tape head right, go to state 3
            "3,b=>b,R,3", // state3: read b, write b, move tape head right, go to state 3
            "3,#=>#,R,4"  // state3: read delta, write delta, move tape head right, HALT
        };

        // an array of the possilbe TM states, "R" = reject state, "H" = Halt state
        char[] ST =
        {
            'R',
            'R',
            'R',
            'R',
            'H'
        };

        String inString = ""; //store user string, currently blank
        boolean accept1; // accept or reject
        TM TM1 = new TM(C,ST); // instantiate TM object with transition instructions and possible states

        //ignore the name of the file when using command line arguments so that only the input string is processed.
        if(args.length >= 1){
            //input string is command line parameter
            inString = args[0]; //set input string to user input
            //process the input string
            accept1 = TM1.processData(inString);// process user input string, return true = accepted, false = rejected
            System.out.println("\n valid string? " + accept1); // print result
        }
    }//end main
}// end class
