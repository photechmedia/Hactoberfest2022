/* A regular expression such that it can be used to validate an IP address.
Using the following definition of an IP address:
  "IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255.
  Leading zeros are allowed.
  The length of A, B, C, or D can't be greater than 3." */
class MyRegex{
    public String pattern = "((([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.){3}([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5]))\\b";
}
