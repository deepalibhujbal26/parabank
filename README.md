Site: https://parabank.parasoft.com/parabank/index.htm

Test Pages
1. Home page
2. Register Page
3. Forgot Login Info Page
4. Account Overview Page
5. Open New Account Page
6. Transfer Fund Page
7. Bill Payment page
8. Find Transactions page
9. Update Contact Info page
10. Request Loan Page

Test Cases for each page 
 - Page: Home Page
   Test case 1:
   - Verify Home Page is displayed
       - Verify Home page is displayed 
       - Verify Customer Login Page (Username , password) text box is displayed
       - Verify "Register" link is displayed
       - Verify "Forgot login info" link is displayed


 - Page: Register Page
   Test case 1: 
   - Verify User is able to register after entering below details
       - name: parabank_user_<dateTime> (generate last part as random datetime as mmddyyyy_mmss)
       - password: parabank#123
       - Rest details as "test details" in each field
       - On successful login user should see msg as "Your account was created successfully. You are now logged in."
   
   Test case 2:
     - Verify User is not able to register again with same user, It should get below msg
       - "This username already exists."
 
   Test case 3:
     - Verify User is not able to register when any of the field is empty
       - For e.g. when SSN is empty, user should get msg as "Social Security Number is required."

   Test case 4:
   - Add one more test case for any other validations.

More test case for more page are coming.....
