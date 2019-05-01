Activity 7

1. A deck of cards is all that is needed to play elevens

2. 
    1. Create game
    2. Check number of cards in deck
    3. Draw 9 cards if there are 9, if fewer draw entire deck
    4. Look for either a pair equaling 11, or a jack queen king combination, if either are present replace with cards in deck
    5. If no such combinations exist, the outcome is a loss
    6. Repeat 1-4 until there are no remaining cards in the deck or on the table

3. Yes

4. 
    a. in the newGame() method and in the contructor

    b. anotherPlayIsPossible(), isLegal()

    c. 0,1,3,6,7

    d. for(int i: i<x, i++) {
        System.out.println(board.cards[i].toString());
    }

    e. anotherPlayIsPossible();

Activity 8

1. All games all involve playing cards and numbers equaling other numbers, all will use a dealing function as well as a size and empty function for shuffling. Some things would be different when put into the other games, like isLegal() and anotherPlayIsPossible because of how those are calculated for elevens.

2. ElevensBoard extends Board, it inherits the variables it inits for to change.

3. They do. All of the methods that will work between games are put into the Board classe, but the methods that would be different are abstract, so they are implemented in each game individually.







