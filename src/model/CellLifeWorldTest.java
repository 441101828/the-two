package model;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CellLifeWorldTest {

	public static CellLifeWorld cell;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		cell=new CellLifeWorld(10,10);
	}

	@Test
	public void testGetCellStatus() {
		assertFalse(cell.getCellStatus(-1, 1));
		assertFalse(cell.getCellStatus(1,-5 ));
		assertFalse(cell.getCellStatus(1, 11));
		assertFalse(cell.getCellStatus(20, 5));
	}//边界默认死细胞测试

	@Test
	public void testGetPericyteCellNum() {
		CellLifeWorld cells=new CellLifeWorld(3,3);
		for(int i=0,z=1;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==1&&j==1)
					continue;
				cells.changeCellStatus(i, j);
				assertEquals(z++,cells.getPericyteCellNum(1, 1));
			}
		}//获取周围细胞数量测试
	}

}
