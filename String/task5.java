class task5{
    public static void main(String args[]){
        System.out.println();
        System.out.println("---STRING---");
        System.out.println();

        System.out.println("---BASIC---");
        System.out.println();

        String Name="Saloni";
        System.out.println("String : "+Name);
        System.out.println();

        System.out.println("Length of the String : "+Name.length());
        System.out.println("String in Uppercase : "+Name.toUpperCase());
        System.out.println("String in Lowercase : "+Name.toLowerCase());
        System.out.println();

        System.out.println("First Letter of String : "+ Name.charAt(0));
        System.out.println("Last Letter of String : "+ Name.charAt(Name.length()-1));
        System.out.println();

        System.out.println("---INTERMEDIATE---");
        System.out.println();

        String First_Name="Saloni";
        String Last_Name="Natesh";

        System.out.println("First Name : "+First_Name);
        System.out.println("Last Name : "+Last_Name);
        System.out.println();

        System.out.println("Concatenated String : "+(First_Name.concat(Last_Name)));
        System.out.println("Strings are Equal : "+(First_Name.equals(Last_Name)));
        System.out.println("Strings are Equal Without considering the case : "+(First_Name.equalsIgnoreCase(Last_Name)));
        System.out.println();

        String s1="Java is an Object Oriented Programming Language";
        System.out.println("Sentence : "+s1);
        System.out.println("If Sentence Contains 'Java' : "+s1.contains("Java"));
        System.out.println();

        String s2="Saloni.nv@gmail.com";
        System.out.println("Email id : "+s2);
        System.out.println("mailid Ends With '.com' : "+s2.endsWith(".com"));
        System.out.println("Domain in Email id : "+s2.substring(0,9));
        System.out.println();

        System.out.println("---ADVANCE---");
        System.out.println();
        System.out.println("Sentence : "+s1);
        System.out.println("Replace ' ' with '-' : "+s1.replace(" ","-"));
        System.out.println("First occurance of 'O' : "+s1.indexOf("O"));
        System.out.println("Last occurance of 'O' : "+s1.lastIndexOf("O"));
        System.out.println();

        String skills="Java,Python,C++,HTML,CSS,JavaScript,SQL";
        System.out.println("Skills : "+skills);
        String[] Skill=skills.split(",");
        for (int i=0;i<Skill.length;i++){
            System.out.println(Skill[i]);
        }
        int a=12;
        System.out.println("Int : "+a);
        System.out.println("String : "+String.valueOf(a));//Converts int to String
        System.out.println();

        System.out.println("---EMPTY---");
        String s3=" ",s4="";
        System.out.println("String s3 : "+s3+".");
        System.out.println("String s4 : "+s4+".");
        System.out.println("String s3 Empty : "+s3.isEmpty());
        System.out.println("String s4 Empty : "+s4.isEmpty());
        System.out.println();

        System.out.println("---BLANK---");
        String s5=" ",s6="",s7="Saloni";
        System.out.println("s5 : "+s5+".");
        System.out.println("s6 : "+s6+".");
        System.out.println("s7 : "+s7+".");

        System.out.println("String s5 Blank : "+s5.isBlank());
        System.out.println("String s6 Blank : "+s6.isBlank());
        System.out.println("String s7 Blank : "+s7.isBlank());
        System.out.println();

        System.out.println("---COMPARE TO---");
        String First_Name_1="Saloni";
        String Last_Name_1="Natesh";
        System.out.println("First Name (FN) : "+First_Name_1);
        System.out.println("Last Name (LN) : "+Last_Name_1);
        System.out.println("Difference between LN and FN : "+Last_Name_1.compareTo(First_Name_1));
        System.out.println();

        System.out.println("---STRING MATCHES---");
        String name1="Saloni";
        System.out.println("String : "+name1);
        System.out.println("String only Alphabet : "+name1.matches("[a-z A-Z]+"));
        System.out.println();

        String S1="Y";
        System.out.println("Letter : "+S1);
        System.out.println("Letter in Lower Case : "+S1.matches("[a-z]"));
        System.out.println("Letter in Upper Case : "+S1.matches("[A-Z]"));
        System.out.println();

        String S2="12345";
        System.out.println("String : "+S2);
        System.out.println("String contains only Digit : "+S2.matches("[0-9]+"));
        System.out.println();

        String S3="09876";
        System.out.println("String  : "+S3);
        System.out.println("String Contains Only Digits ? "+S3.matches("\\d+"));
        System.out.println();

        String S4=" ";
        System.out.println("String : "+S4+".");
        System.out.println("String contains Space ? "+S4.matches(" *"));
        System.out.println();

        System.out.println("---VALIDATING PHONE NUMBER USING MATCHES---");
        String phone_number="9884327890";
        System.out.println("Phone Number : "+phone_number);
        System.out.println("Is Phone Number Valid ? "+phone_number.matches("\\d{10}"));
        System.out.println();

        System.out.println("---VALIDATING EMAIL ID---");
        String mailid="Saloni.nv@gmail.com";
        System.out.println("Mail ID : "+mailid);
        System.out.println("Is Mail Id Valid ? "+mailid.matches("[a-zA-Z0-9_.]+@[a-zA-Z]+\\.com"));
        System.out.println();

        System.out.println("---STUDENT DETAILS---");
        String student_name="Saloni Natesh";
        System.out.println("Name : "+student_name);
        System.out.println("Length of String : "+student_name.length());
        System.out.println("Name in Upper Case : "+student_name.toUpperCase());
        System.out.println("Name in Lower Case : "+student_name.toLowerCase());
        System.out.println("First Charcter in Name : "+student_name.charAt(0));
        System.out.println("Last Character in Name : "+student_name.charAt(student_name.length()-1));
        System.out.println("Replace ' ' with _ : "+student_name.replace(" ", "_"));
        System.out.println("Check if Name contains Kumar ? "+student_name.contains("Kumar"));
        System.out.println();

        System.out.println("---MATH METHODS---");
        System.out.println();

        System.out.println("---AREA---");
        System.out.println("1.RHOMBUS");
        System.out.println("2.PENTAGON");
        System.out.println("3.HEXAGON");
        System.out.println("4.HEPTAGON");
        System.out.println("5.OCTAGON");
        System.out.println("6.TRAPEZOID");
        System.out.println();
        String ch = "6";
        System.out.println("Choice Entered : "+ch);
        System.out.println();
        switch(ch){
            case "1":
                System.out.println("---AREA OF RHOMBUS---");
                int degree=30;
                System.out.println("Angle Degree : "+degree);
                double radian=(Math.PI*degree)/180;
                System.out.println("Angle in Radians : "+radian);
                double s=8;
                System.out.println("1 Side of Rhomus : "+s);
                double rhombus_area=s*s*Math.sin(radian);
                System.out.println("Area of Rhombus : "+Math.ceil(rhombus_area));
                break;

            case "2":
                System.out.println("---AREA OF PENTAGON---");
                int side1=5;
                System.out.println("Side of Pentagon : "+side1);
                double pentagon_area=Math.sqrt(5*(5+2*Math.sqrt(5)))*Math.pow(side1,2)/4;
                System.out.println("Area of Pentagon : "+Math.floor(pentagon_area ));
                break;

            case "3":
                System.out.println("---AREA OF HEXAGON---");
                int a1=5;
                System.out.println("Side of Hexagon : "+a1);
                double Hexagon_area=3*Math.sqrt(3)*Math.pow(a1,2)/2;
                System.out.println("Area of Hexagon : "+Math.floor(Hexagon_area));
                break;

            case "4":
                System.out.println("---AREA OF HEPTAGON---");
                int a2=5;
                System.out.println("Side of Heptagon : "+a2);
                double heptagon_area=(7*Math.pow(a2,2))/(4*Math.tan(Math.PI/7));
                System.out.println("Area of Heptagon : "+Math.floor(heptagon_area));
                break;

            case "5":
                System.out.println("---AREA OF OCTAGON---");
                int a3=5;
                System.out.println("Side of Octagon : "+a3);
                double octagon_area=2*(1+Math.sqrt(2))*Math.pow(a3, 2);
                System.out.println("Area of Octagon : "+Math.floor(octagon_area));
                break;

            case "6":
                System.out.println("---AREA OF TRAPEZOID---");
                int b1=4,b2=6,h1=4;
                System.out.println("Base 1 of Trapezoid : "+b1);
                System.out.println("Base 2 of Trapezoid : "+b2);
                System.out.println("Height of Trapezoid : "+h1);
                double Trapezoid_area=((b1+b2)*h1)/2;
                System.out.println("Area of Trapezoid : "+Math.floor(Trapezoid_area));
                break;
            default:
                System.out.println("Enter From the given choice (1/2/3/4/5/6) ");
                break;
        }
        System.out.println();

        System.out.println("---VOLUME---");
        System.out.println();
        System.out.println("1.SPHERE");
        System.out.println("2.HEMISPHERE");
        System.out.println("3.CONE");
        System.out.println("4.CUBOID");
        System.out.println("5.CUBE");

        String Choice="3";
        System.out.println("Choice Entered : "+Choice);
        System.out.println();

        switch (Choice) {
            case "1":
                System.out.println("---VOLUME OF SPHERE---");
                double radius=12;
                System.out.println("Radius of Sphere : ");
                double volume_sphere = (4*Math.PI*Math.pow(radius,3))/3;
                System.out.println("Volume of Sphere : "+Math.floor(volume_sphere));
                break;

            case "2":
                System.out.println("---VOLUME OF HEMISPHERE---");
                double radius_1=12;
                System.out.println("Radius of Hemisphere : ");
                double volume_hemisphere = (2*Math.PI*Math.pow(radius_1,3))/3;
                System.out.println("Volume of Sphere : "+Math.floor(volume_hemisphere));
                break;

            case "3":
                System.out.println("---VOLUME OF CONE---");
                double radius_2=3,height_2=8;
                System.out.println("Radius : "+radius_2);
                System.out.println("Height : "+height_2);
                double volume_cone=(Math.PI*Math.pow(radius_2,2)*height_2)/3;
                System.out.println("Volume Of Cone : "+Math.floor(volume_cone));
                break;

            case "4":
                System.out.println("---VOLUME OF CUBOID---");
                double length=2,breadth=3,height=4;
                System.out.println("Length : "+length);
                System.out.println("Breadth : "+breadth);
                System.out.println("Height : "+height);
                double volume_cuboid=length*breadth*height;
                System.out.println("Volume of Cuboid : "+Math.floor(volume_cuboid));
                break;

            case "5":
                System.out.println("---VOLUME OF CUBE---");
                double side=12;
                System.out.println("Side : "+side);
                double volume_cube =Math.pow(side,3);
                System.out.println("Volume Of Cube : "+Math.floor(volume_cube));
                break;

            default:
                System.out.println("Please enter From the Given Choice (1/2/3/4/5)");
                break;
        }
        System.out.println();
        System.out.println("---SINE FUNCTION---");
        System.out.println("sin of 90 : "+Math.sin(Math.PI/2));
        System.out.println("sin of 180 : "+Math.sin(Math.PI));
        System.out.println("sin of 45 : "+Math.sin(Math.PI/4));
        System.out.println("sin of 30 : "+Math.sin(Math.PI/6));
        System.out.println("sin of 60 : "+Math.sin(Math.PI/3));
        System.out.println();

        System.out.println();
        System.out.println("---TAN FUNCTION---");
        System.out.println("tan of 90 : "+Math.tan(Math.PI/2));
        System.out.println("tan of 180 : "+Math.tan(Math.PI));
        System.out.println("tan of 45 : "+Math.tan(Math.PI/4));
        System.out.println("tan of 30 : "+Math.tan(Math.PI/6));
        System.out.println("tan of 60 : "+Math.tan(Math.PI/3));
        System.out.println();

        System.out.println("---COSINE FUNCTION---");
        System.out.println("cos of 90 : "+Math.cos(Math.PI/2));
        System.out.println("cos of 180 : "+Math.cos(Math.PI));
        System.out.println("cos of 45 : "+Math.cos(Math.PI/4));
        System.out.println("cos of 30 : "+Math.cos(Math.PI/6));
        System.out.println("cos of 60 : "+Math.cos(Math.PI/3));
        System.out.println();

        System.out.println("---LOG AND E FUNCTIONS---");
        System.out.println("Log of 10 : "+Math.log(10));
        System.out.println("Log of 200 with base 10 : "+Math.log10(100));
        System.out.println("Value of e power 0: "+Math.exp(0));
        System.out.println("Value of e power 1: "+Math.exp(1));
        System.out.println();

        System.out.println("---DEGREE TO RADIANS---");
        double degree1=90;
        System.out.println("Degree :"+degree1);
        System.out.println("Radian : "+Math.toRadians(degree1));
        System.out.println();

        System.out.println("---RADIANS TO DEGREE---");
        double radians1=Math.PI;
        System.out.println("Radians : "+radians1);
        System.out.println("Degree : "+Math.toDegrees(radians1));
        System.out.println();

        System.out.println("---SIGNUM FUNCTION---");
        int x1=12,x2=-13,x3=0;
        System.out.println("X1 : "+x1);
        System.out.println("Sign of X1 : "+Math.signum(x1));
        System.out.println("X2 : "+x2);
        System.out.println("Sign of X2 : "+Math.signum(x2));
        System.out.println("X3 : "+x3);
        System.out.println("Sign of X3 : "+Math.signum(x3));
        System.out.println();




    }
}
