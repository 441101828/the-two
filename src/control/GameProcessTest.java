package control;

import static org.junit.Assert.*;
import java.lang.reflect.Method;

import org.junit.BeforeClass;
import org.junit.Test;



public class GameProcessTest {

	public static GameProcess gameControl;
	@BeforeClass
	public static void beforeClass()
	{
		gameControl=new GameProcess(10,10);
	}
	@Test
	public void testChangeCellStatus() throws Exception {
		boolean status=false;
		int row=5,col=5;
		status=gameControl.changeCellStatus(row, col);
	
		assertNotSame(status,gameControl.world.getCellStatus(row, col));
	}//网格中某一细胞状态改变测试
	@Test
	public void testCellSavePrinciple() throws Exception
	{
		boolean status=false;
		assertTrue(gameControl.cellSavePrinciple(status, 3));
		assertEquals(status,gameControl.cellSavePrinciple(status, 2));
		for(int i=0;i<=8;i++)
		{
			if(i!=2&&i!=3)
				assertFalse(gameControl.cellSavePrinciple(status, i));
		}
	}//细胞生存规则测试
	@SuppressWarnings("deprecation")
	@Test
	public void testcellMultiply() throws Exception
	{
		GameProcess game = new GameProcess(3,3);
		GameProcess game1= new GameProcess(3,3);
		GameProcess game2= new GameProcess(3,3);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==1||j==1)
				{
					game.changeCellStatus(i, j);
				}
				else
				{
					game.changeCellStatus(i, j);
					game1.changeCellStatus(i, j);
				}
				
			}
		}
		for(int z=1;z<=2;z++)
		{
			game.cellMultiply();
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					if(z==1)
						assertEquals(game.world.getCellStatus(i, j),game1.world.getCellStatus(i, j));
					else
						assertEquals(game.world.getCellStatus(i, j),game2.world.getCellStatus(i, j));
				}
			}
		}//细胞全体变化测试
	}
}
