// Decompiled by DJ v3.8.8.85 Copyright 2005 Atanas Neshkov  Date: 09.01.2006 22:17:27
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Player.java

package Data;

import java.awt.Color;
import java.io.PrintStream;
import java.io.Serializable;

// Referenced classes of package Data:
//            Player, Data, DeathMatch, Match

class Walkover extends Player
    implements Serializable
{

    public Walkover()
    {
        super.rank = Data.MAXRANK;
    }

    public Walkover(int rank)
    {
        super.rank = rank;
    }

    public boolean isWalkover()
    {
        return true;
    }

    public String getName()
    {
        if(Data.debug)
            System.out.println("    WALKOVER");
        return "(No player)";
    }

    public int getRank()
    {
        return super.rank;
    }

    public Color getColor()
    {
        return DeathMatch.M_WO_COL;
    }

    public Match getParentMatch()
    {
        return null;
    }

    private static final long serialVersionUID = 0xcadd3c85ebed4ce6L;

}