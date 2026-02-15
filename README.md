<h2 align = "center">System Output</h2>

<p align ="center">
  <image src="assets/output.png" alt="Output" height="70%"/>
    <br/>
</p>

<br/>
<h2 align="center">Design ATM</h2>

<p>An automated teller machine (ATM) is an electronic telecommunications instrument that provides the clients of a financial institution with access to financial transactions in a public space without the need for a cashier or bank teller. ATMs are necessary as not all the bank branches are open every day of the week, and some customers may not be in a position to visit a bank each time they want to withdraw or deposit money.</p>

<p align="center">
  <image src="assets/atm.png" alt="ATM MACHINE" height="700px"/>
    <br/>
    ATM
</p>
<br/>

### System Requirement

**The main components of the ATM that will affect interactions between the ATM and its users are:**

   1. **Card reader:** to read the users’ ATM cards.
   2. **Keypad:** to enter information into the ATM e.g. PIN. cards.
   3. **Screen:** to display messages to the users.
   4. **Cash dispenser:** for dispensing cash.
   5. **Deposit slot:** For users to deposit cash or checks.
   6. **Printer:** for printing receipts.
   7. **Communication/Network Infrastructure:** it is assumed that the ATM has a communication infrastructure to communicate with the bank upon any transaction or activity.


**The user can have two types of accounts: 1) Checking, and 2) Savings, and should be able to perform the following five transactions on the ATM:**

   1. **Balance inquiry:** To see the amount of funds in each account.
   2. **Deposit cash:** To deposit cash.
   3. **Deposit check:** To deposit checks.
   4. **Withdraw cash:** To withdraw money from their checking account.
   5. **Transfer funds:** To transfer funds to another account.
<br/>

<h2 align="center"> Use Case Diagram</h2>
<br/>

<p align="center">
  <image src="assets/Screenshot_1.png" alt="use case diagram" height="700px"/>
    <br/>
</p>

### Use Case Diagram

**Operator: The operator will be responsible for the following operations:**

   1. Turning the ATM ON/OFF using the designated Key-Switch.
   2. Refilling the ATM with cash.
   3. Refilling the ATM’s printer with receipts.
   4. Refilling the ATM’s printer with INK.
   5. Take out deposited cash and checks.

**Customer: The ATM customer can perform the following operations:**

   1. Balance inquiry: the user can view his/her account balance.
   2. Cash withdrawal: the user can withdraw a certain amount of cash.
   4. Deposit funds: the user can deposit cash or checks.
   5. Transfer funds: the user can transfer funds to other accounts.

**Bank Manager: The Bank Manager can perform the following operations:**

   1. Generate a report to check total deposits.
   2. Generate a report to check total withdrawals.
   3. Print total deposits/withdrawal reports.
   4. Checks the remaining cash in the ATM.
<br/>

<h2 align="center">Class Diagram</h2>
<br/>

<p align="center">
  <image src="assets/atm-class-diagram.png" alt="Class Diagram" height="700px"/>
    <br/>
</p>

### Class Diagram

   * **ATM:** The main part of the system for which this software has been designed. It has attributes like ‘atmID’ to distinguish it from other available ATMs, and ‘location’ which defines the physical address of the ATM.
   * **CardReader:** To encapsulate the ATM’s card reader used for user authentication.
   * **CashDispenser:** To encapsulate the ATM component which will dispense cash.
   * **Keypad:** The user will use the ATM’s keypad to enter their PIN or amounts.
   * **Screen:** Users will be shown all messages on the screen and they will select different transactions by touching the screen.
   * **Printer:** To print receipts.
   * **DepositSlot:** User can deposit checks or cash through the deposit slot.
   * **Bank:** To encapsulate the bank which ownns the ATM. The bank will hold all the account information and the ATM will communicate with the bank to perform customer transactions.
   * **Account:** We’ll have two types of accounts in the system: 1)Checking and 2)Saving.
   * **Customer:** This class will encapsulate the ATM’s customer. It will have the customer’s basic information like name, email, etc.
   * **Card:** Encapsulating the ATM card that the customer will use to authenticate themselves. Each customer can have one card.
   * **Transaction:** Encapsulating all transactions that the customer can perform on the ATM, like BalanceInquiry, Deposit, Withdraw, etc.

<br/>

### Sequence Diagram
<br/>

<p align="center">
  <image src="assets/sequence.png" alt="Sequence diagram"/>
    <br/>
     Sequence Diagram for ATM
</p>

