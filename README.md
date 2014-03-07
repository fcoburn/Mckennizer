************************************
***                              ***
***   The Mckennizer README.md   ***
***                              ***
************************************

So this program is very simple, and probably the first program I ever really
wrote on my own outside of school. It's supposed to be a replacement for
throwing the I Ching. The idea is that you three coins, six times, and note
if most of them are heads or not. If you get 2/3 heads, you draw a straight
line. If you get 2/3 tails, you draw a broken line. If you get all heads or
all tails, this is a changing line, so you draw your straight or broken line
with an X through it. The program's output is simple, and is basically the same
as you would draw if you threw the coins yourself.

Possible issues with the program is that calls to Math.random() might not be
random enough. On some machines you might get funny results. In the future I
will be investigating better random number algorithms.

Things I plan on adding are letting the user throw multiple times, although
the wisdom of the I Ching is known to deplete if misued... Also, a stickier
problem will be displaying the hexagram number, and the hexagram that the one
the user has thrown will "turn into" once the changing lines apply. However,
I think this is a good starting place. Happy divining!
