************************************
************************************
	The Mckennizer README.md		
************************************
************************************

Intro:

So this program is very simple, and probably the first thing I ever wrote
on my own outside of school. It's supposed to be a replacement for throwing
the I Ching. The idea is that you three coins, six times, and note if most 
of them are heads or not. If you get 2/3 heads, you draw a straight line.
If you get 2/3 tails, you draw a broken line. If you get all heads or all 
tails, this is a changing line, so you draw your straight or broken line with
a mark through it. Random numbers do the coin tosses for you, and the result is
displayed to the user. The output is simple, and is basically the same as you
would draw if you threw the coins yourself.

Issues:

One possible issue is that calls to Math.random() might not be random enough.
On some machines you might get funny results, although java should ensure some
kind of uniformity. In the future I will be investigating better random number
algorithms. For now Math.random() will do.

New/Upcoming Features:

The user can now throw multiple times, although the wisdom of the I Ching
is known to deplete if misused... A stickier problem will be displaying the 
hexagram number as well as the hexagram that the one the user has thrown will
"turn into" once changing lines apply. That will be tackled in the next version.
This is the final version of the static method, one file format of this code.
I feel it is a good starting place, and I will be making another version.

Happy divining!

Thanks to:
 
-Terence and Dennis McKenna, an obvious inspiration and the program's namesake.
-Kevin K, who first showed me how to throw the I Ching, who's method I used.
-Doug B, for encouraging me to put this up on GitHub.
-B.T.S. & D.L. for spiritual guidance.
