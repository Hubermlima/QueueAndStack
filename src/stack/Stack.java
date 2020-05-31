package stack;


import stack.Cell;

public class Stack implements IStack {
	
	private Cell cellTop = null;	
	private int index = 0;
	
	@Override
	public void push(Integer info) {
		Cell cell = new Cell();
		cell.setInfo(info);
		cell.setPointer(cellTop);
		this.cellTop = cell;
		this.index++;
	}
	
	@Override
	public void listAll() {
		Cell cell = this.cellTop;
		for (int i = 0; i < index; i++) {
	        System.out.println(cell.getInfo());
	        cell = getProximo(cell);       
		}
		
	}
	
	@Override
	public void removeALL() { // Last in, first out (LIFO)
		
		Cell cellTemp;
		for (int i = 0; i < this.index ; i++) {
				cellTemp = this.cellTop;		
				this.cellTop = null;
				this.cellTop = getProximo(cellTemp);
		}
		this.index = 0;
	
	}
	
	public Cell getProximo(Cell cell) {
		return cell.getPointer();
	}

	public Cell getCellTop() {
		return cellTop;
	}

	public void setCellTop(Cell cellTop) {
		this.cellTop = cellTop;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
   
	
}
