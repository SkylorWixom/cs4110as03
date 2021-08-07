
public class TM{

    //Attributes
    String [] Code; //state transition function as code
    char [] StateType; // ='H' if Halt state
    String Tape; //read/write tape (input string as data)
    int tapePos; //tape head position
    int cstate; // current state

    int state1;
    char inSymbol;
    char outSymbol;
    char moveLR;
    int state2;

    //constructor:
    TM(String[] c, char[] ST){
        Code = c; //assign the c array to code
        StateType = ST; //assign ST array to state type
        Tape = "#"; //initialize the tape with delta - denoted as # 
        tapePos = 0; //tape head position is initialized to 0
        cstate = 0; //Assume the current state is initialized to 0
    }

    //Methods
    //getter for state
    int getState(){
        //connects with cstate
        return cstate;
    }
    
    //setter for state
    void setState(int s){
        //connects with cstate
        cstate = s;
    }

    //set the tape data !REMEMBER TO TACK ON A DELTA AT THE END OF THE INPUT STRING!
    void setTape(String s){
        //connects with tape, example: aabb then add delta final: aabb#
        Tape = s + "#";
    }

    //
    void stateTransition(char c){

        String temp = null;

        //for each transition in Code array
        for(String s : Code){
            //
            if(cstate == Integer.parseInt(s.substring(0,1)) && s.charAt(2) == c){
                //Tape = Tape.substring(0, tapePos) + s.charAt(5) + Tape.substring(tapePos+1);
                temp = s;
                break;
            }
        }

        if(temp != null){
            char[] tempC;

            if(){

            }
        }
        else{

        }
    }

    //
    boolean processData(String s){
        setTape(s);

        while(StateType[cstate] == 'R'){
            stateTransition(Tape.charAt(tapePos));
        }

        if(StateType[cstate] == 'H'){
            return true;
        }
        else{
            return false;
        }
    }
}