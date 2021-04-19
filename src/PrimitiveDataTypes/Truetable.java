package PrimitiveDataTypes;

public class Truetable {
    public static void main(String[] args) {

        //If i want to drive in IL, I need to have Driver license and legal age of 16 or older
        int age_limit = 16;
        boolean licence = true;

        int myAge = 25;
        boolean myLicense = false;
                              //True                  false

        boolean canI_Drive = myAge >= age_limit && myLicense == licence;
        boolean canI_Drive2 = myAge >= age_limit && myLicense != licence;
        System.out.println("Can i drive in IL " + canI_Drive);//false
        System.out.println(canI_Drive2);

        //There is an event for adult
        // You have to be more than 21 years old
        //dress code has to be casual
        int M_age = 26;
        char M_dress_code ='V';
        boolean invintation =true;

        char dress_code= 'C';
        int R_age =21;
        boolean my_invintation = true;

        // Name of the data  type-.(Can_I_join)// True                False
        boolean can_i_join = M_age> R_age && dress_code==M_dress_code && my_invintation==invintation;
        System.out.println("Can i join this event " + can_i_join);
      //Let's modifite this and add one more value = boolean my_invintation = true;


        // there is an event for kids ,to bbe able to attend to this event :
        // They have to be 12 years old or less
        //they are 42 inc or shorter
        //AND have to have parent

        int ageLimit = 12;
        int kids_age = 12;
        boolean hasParent= true;

        int heights = 42;
        int kids_heights =32;
        boolean kid_has_Parent =false;

        boolean check = kids_age <= ageLimit;
        System.out.println(check);

        boolean attendtokid_party = kids_age<=ageLimit || kids_heights <= heights ;
        System.out.println(attendtokid_party);
        boolean attend = hasParent ==kid_has_Parent && (kids_age<=ageLimit || kids_heights <= heights);
        System.out.println("2 "+attend);


    }
}
