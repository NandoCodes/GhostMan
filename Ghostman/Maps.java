package Ghostman;
/**
 * This class is used to stores the maps of the game into a list.
 * 0 represent dots,1 blocks,2 pacs,3 ghost,4 redpac
 */
import java.util.ArrayList;
import java.util.List;

public class Maps 
{
	private List<Integer[][]> mapList=new ArrayList<Integer[][]>();
	private final Integer[][] mapOne = new Integer[][] { 
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0 },
		{ 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0 },
		{ 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0 },
		{ 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0 },
		{ 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 1, 0, 0, 0, 0, 2, 0, 2, 0, 0, 0, 0, 1, 0 },
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0 },
		{ 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0 },
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0 },
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0 } };
		
		private final Integer mapTwo[][] = new Integer[][] { 
			{ 2, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 2 },
			{ 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0 },
			{ 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 },
			{ 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1 },
			{ 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1 },
			{ 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1 },
			{ 0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 0, 0 },
			{ 1, 1, 0, 1, 0, 1, 0, 3, 0, 1, 0, 1, 0, 1, 1 },
			{ 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1 },
			{ 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1 },
			{ 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1 },
			{ 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 },
			{ 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1 },
			{ 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1 },
			{ 1, 2, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 2, 1 } };
		
			private final Integer mapThree[][] = new Integer[][] { 
				{ 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1 },
				{ 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1 },
				{ 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
				{ 1, 0, 0, 1, 1, 1, 1, 3, 1, 1, 1, 1, 0, 0, 1 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
				{ 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1 },
				{ 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1 },
				{ 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1 },
				{ 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1 } };
		public Maps()
		{
			mapList.add(mapOne);
			mapList.add(mapTwo);
			mapList.add(mapThree);
		}
		public List<Integer[][]> getMapList()
		{
			return this.mapList;
		}
		
}
