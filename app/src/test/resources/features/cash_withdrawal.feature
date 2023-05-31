Feature: Cash Withdrawal
    Scenario: Successful withdrawal from an account in credit
	Given I have deposited <deposit> in my account
	When I request <withdrawal>
	Then <bucks> should be dispensed

	Examples:
	    | deposit | withdrawal | bucks |
	    | $100    | $20	   | $20   |
	    | $100    | $30        | $30   |
