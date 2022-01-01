Feature: Create a new watchlist
  Scenario: The user can add a new watchlist
    Given Click Watchlist tab
    Given Click Create a Watchlist
    Given Enter Watchlist Name
    Given Click Add a Watchlist
    Then Watchlist is created successfully
#
#    Scenario: The user can edit existing watchlist
#      Given Click Watchlist tab
#      Given Click edit watchlist
#      Given Edit the name of watchlist
#      Given Click save watchlist button
#      Then Watchlist is edited successfully