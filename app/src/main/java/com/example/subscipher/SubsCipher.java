package com.example.subscipher;

public class SubsCipher {

    //default encryption & decryption functions:

    public static String encrypt(String plain){
        String cipher = new String("");
        plain= plain.toLowerCase();
        for(int i=0 ; i<plain.length() ; i++){
            switch(plain.charAt(i)){
                case 'a':
                    cipher+= 'h' ;
                    break ;
                case 'b':
                    cipher+= 'i' ;
                    break ;
                case 'c':
                    cipher+= 'j' ;
                    break ;
                case 'd':
                    cipher+= 'k' ;
                    break ;
                case 'e':
                    cipher+= 'l' ;
                    break ;
                case 'f':
                    cipher+= 'm' ;
                    break ;
                case 'g':
                    cipher+= 'n' ;
                    break ;
                case 'h':
                    cipher+= 'o' ;
                    break ;
                case 'i':
                    cipher+= 'p' ;
                    break ;
                case 'j':
                    cipher+= 'q' ;
                    break ;
                case 'k':
                    cipher+= 'a' ;
                    break ;
                case 'l':
                    cipher+= 'b' ;
                    break ;
                case 'm':
                    cipher+= 'c' ;
                    break ;
                case 'n':
                    cipher+= 'd' ;
                    break ;
                case 'o':
                    cipher+= 'e' ;
                    break ;
                case 'p':
                    cipher+= 'f' ;
                    break ;
                case 'q':
                    cipher+= 'g' ;
                    break ;
                case 'r':
                    cipher+= 'w' ;
                    break ;
                case 's':
                    cipher+= 'r' ;
                    break ;
                case 't':
                    cipher+= 'x' ;
                    break ;
                case 'u':
                    cipher+= 'y' ;
                    break ;
                case 'v':
                    cipher+= 'z' ;
                    break ;
                case 'w':
                    cipher+= 's' ;
                    break ;
                case 'x':
                    cipher+= 't' ;
                    break ;
                case 'y':
                    cipher+= 'u' ;
                    break ;
                case 'z':
                    cipher+= 'v' ;
                    break ;
            }
        }
        return cipher ;
    }

    public static String decrypt(String cipher){
        String plain = new String("");
        cipher = cipher.toLowerCase();
        for(int i=0 ; i<cipher.length() ; i++){
            switch(cipher.charAt(i)){
                case ' ':
                    plain+= ' ';
                    break ;
                case 'a':
                    plain+= 'k' ;
                    break ;
                case 'b':
                    plain+= 'l' ;
                    break ;
                case 'c':
                    plain+= 'm' ;
                    break ;
                case 'd':
                    plain+= 'n' ;
                    break ;
                case 'e':
                    plain+= 'o' ;
                    break ;
                case 'f':
                    plain+= 'p' ;
                    break ;
                case 'g':
                    plain+= 'q' ;
                    break ;
                case 'h':
                    plain+= 'a' ;
                    break ;
                case 'i':
                    plain+= 'b' ;
                    break ;
                case 'j':
                    plain+= 'c' ;
                    break ;
                case 'k':
                    plain+= 'd' ;
                    break ;
                case 'l':
                    plain+= 'e' ;
                    break ;
                case 'm':
                    plain+= 'f' ;
                    break ;
                case 'n':
                    plain+= 'g' ;
                    break ;
                case 'o':
                    plain+= 'h' ;
                    break ;
                case 'p':
                    plain+= 'i' ;
                    break ;
                case 'q':
                    plain+= 'j' ;
                    break ;
                case 'r':
                    plain+= 's' ;
                    break ;
                case 's':
                    plain+= 'w' ;
                    break ;
                case 't':
                    plain+= 'x' ;
                    break ;
                case 'u':
                    plain+= 'y' ;
                    break ;
                case 'v':
                    plain+= 'z' ;
                    break ;
                case 'w':
                    plain+= 'r' ;
                    break ;
                case 'x':
                    plain+= 't' ;
                    break ;
                case 'y':
                    plain+= 'u' ;
                    break ;
                case 'z':
                    plain+= 'v' ;
                    break ;
            }
        }
        return plain ;
    }

    //useful validation functions:

    public static boolean isRepeated(String s){
        for(int i=0 ; i<s.length() ; i++){
            for(int j=i+1 ; j<s.length() ; j++){
                if(s.charAt(i) == s.charAt(j) && s.charAt(i)!= ' '){
                    return true ;
                }
            }
        }
        return false;
    }

    public static boolean isNotAlphabetic(String s){
        for (int i=0 ; i<s.length() ;i++){
            if(!(s.charAt(i) >= 'a' && s.charAt(i) <='z') && !(s.charAt(i)>='A' && s.charAt(i)<='Z')){
                return true ;
            }
        }
        return false ;
    }

    //customized encryption & decryption functions:

    public static String encrypt(String subTable, String plain){
        String cipher = new String("");
        plain.toLowerCase();
        for(int i=0 ; i<plain.length() ; i++){
            switch(plain.charAt(i)){
                case 'a':
                    cipher+= subTable.charAt(0) ;
                    break ;
                case 'b':
                    cipher+= subTable.charAt(1) ;
                    break ;
                case 'c':
                    cipher+= subTable.charAt(2) ;
                    break ;
                case 'd':
                    cipher+= subTable.charAt(3) ;
                    break ;
                case 'e':
                    cipher+= subTable.charAt(4) ;
                    break ;
                case 'f':
                    cipher+= subTable.charAt(5) ;
                    break ;
                case 'g':
                    cipher+= subTable.charAt(6) ;
                    break ;
                case 'h':
                    cipher+= subTable.charAt(7) ;
                    break ;
                case 'i':
                    cipher+= subTable.charAt(8) ;
                    break ;
                case 'j':
                    cipher+= subTable.charAt(9) ;
                    break ;
                case 'k':
                    cipher+= subTable.charAt(10) ;
                    break ;
                case 'l':
                    cipher+= subTable.charAt(11) ;
                    break ;
                case 'm':
                    cipher+= subTable.charAt(12) ;
                    break ;
                case 'n':
                    cipher+= subTable.charAt(13) ;
                    break ;
                case 'o':
                    cipher+= subTable.charAt(14) ;
                    break ;
                case 'p':
                    cipher+= subTable.charAt(15) ;
                    break ;
                case 'q':
                    cipher+= subTable.charAt(16) ;
                    break ;
                case 'r':
                    cipher+= subTable.charAt(17) ;
                    break ;
                case 's':
                    cipher+= subTable.charAt(18) ;
                    break ;
                case 't':
                    cipher+= subTable.charAt(19) ;
                    break ;
                case 'u':
                    cipher+= subTable.charAt(20) ;
                    break ;
                case 'v':
                    cipher+= subTable.charAt(21) ;
                    break ;
                case 'w':
                    cipher+= subTable.charAt(22) ;
                    break ;
                case 'x':
                    cipher+= subTable.charAt(23) ;
                    break ;
                case 'y':
                    cipher+= subTable.charAt(24) ;
                    break ;
                case 'z':
                    cipher+= subTable.charAt(25) ;
                    break ;
            }
        }
        return cipher ;
    }

    public static String decrypt(String subTable, String cipher){
        String plain = new String("");
        cipher.toLowerCase();
        for(int i=0 ; i<cipher.length() ; i++){
            if(cipher.charAt(i) == subTable.charAt(0)){
                plain += 'a' ;
            }else if(cipher.charAt(i) == subTable.charAt(1)){
                plain += 'b' ;
            }else if(cipher.charAt(i) == subTable.charAt(2)){
                plain += 'c' ;
            }else if(cipher.charAt(i) == subTable.charAt(3)){
                plain += 'd' ;
            }else if(cipher.charAt(i) == subTable.charAt(4)){
                plain += 'e' ;
            }else if(cipher.charAt(i) == subTable.charAt(5)){
                plain += 'f' ;
            }else if(cipher.charAt(i) == subTable.charAt(6)){
                plain += 'g' ;
            }else if(cipher.charAt(i) == subTable.charAt(7)){
                plain += 'h' ;
            }else if(cipher.charAt(i) == subTable.charAt(8)){
                plain += 'i' ;
            }else if(cipher.charAt(i) == subTable.charAt(9)){
                plain += 'j' ;
            }else if(cipher.charAt(i) == subTable.charAt(10)){
                plain += 'k' ;
            }else if(cipher.charAt(i) == subTable.charAt(11)){
                plain += 'l' ;
            }else if(cipher.charAt(i) == subTable.charAt(12)){
                plain += 'm' ;
            }else if(cipher.charAt(i) == subTable.charAt(13)){
                plain += 'n' ;
            }else if(cipher.charAt(i) == subTable.charAt(14)){
                plain += 'o' ;
            }else if(cipher.charAt(i) == subTable.charAt(15)){
                plain += 'p' ;
            }else if(cipher.charAt(i) == subTable.charAt(16)){
                plain += 'q' ;
            }else if(cipher.charAt(i) == subTable.charAt(17)){
                plain += 'r' ;
            }else if(cipher.charAt(i) == subTable.charAt(18)){
                plain += 's' ;
            }else if(cipher.charAt(i) == subTable.charAt(19)){
                plain += 't' ;
            }else if(cipher.charAt(i) == subTable.charAt(20)){
                plain += 'u' ;
            }else if(cipher.charAt(i) == subTable.charAt(21)){
                plain += 'v' ;
            }else if(cipher.charAt(i) == subTable.charAt(22)){
                plain += 'w' ;
            }else if(cipher.charAt(i) == subTable.charAt(23)){
                plain += 'x' ;
            }else if(cipher.charAt(i) == subTable.charAt(24)){
                plain += 'y' ;
            }else if(cipher.charAt(i) == subTable.charAt(25)){
                plain += 'z' ;
            }
        }
        return plain ;
    }
}
