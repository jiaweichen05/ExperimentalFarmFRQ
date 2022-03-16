import java.lang.reflect.Array;
import java.util.ArrayList;

public class ExperimentalFarm
{
    private Plot[][] farmPlots;

    public ExperimentalFarm(Plot[][] p)
    {
        farmPlots = p;
    }

    /** Returns the plot with the highest yield
     * for a given crop type, as described in part (a).
     */
    public Plot getHighestYield(String c)
    {
        int max = 0;
        Plot temp = null;
        for (int row = 0; row < farmPlots.length; row++)
        {
            for (int col = 0; col < farmPlots[0].length; col++)
            {
                if (farmPlots[row][col].getCropType().equals(c))
                {
                    if(farmPlots[row][col].getCropYield() > max)
                    {
                        max = farmPlots[row][col].getCropYield();
                        temp = farmPlots[row][col];
                    }
                }
            }
        }
        return temp;
    }

    /** Returns true if all plots in a given column in
     * the two-dimensional array farmPlots
     * contain the same type of crop, or false otherwise,
     * as described in part (b).
     */
    public boolean sameCrop(int col)
    {
        String type = farmPlots[0][col].getCropType();
        for (int i = 1; i < farmPlots.length; i++)
        {
            if (!farmPlots[i][col].getCropType().equals(type))
            {
                return false;
            }
        }
        return true;
    }

    /** Returns an arraylist of Plots
     * that are growing crop "crop",
     * as described in part (c).
     */
    public ArrayList<Plot> plotsWithCrop(String crop)
    {
        ArrayList<Plot> temp = new ArrayList<Plot>();
        for (int i = 0; i < farmPlots.length; i++)
        {
            for (int j = 0; j < farmPlots[0].length; j++)
            {
                if (farmPlots[i][j].getCropType().equals(crop))
                {
                    temp.add(farmPlots[i][j]);
                }
            }
        }
        return temp;
    }
}
