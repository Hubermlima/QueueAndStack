package lista;

public class Lista implements ILista {
	
	private Cell cell = new Cell();
	private int index = 0;
	
	@Override
	public void addNode(Integer info) {
		Cell cell = getUltimo();
		cell.setInfo(info);
		cell.setPointer(new Cell());
		this.index++;
	}
	
	@Override
	public void listAll() {
		Cell cell = this.cell;
		for (int i = 0; i <= this.index; i++) {
			System.out.println(cell.getInfo());
	        cell = getProximo(cell);       
		}
		
	}
	
	@Override
	public void removeALL() { // First in, first out (FIFO)
		Cell cellTemp;
		Cell cell = this.cell;
		for (int i = 0; i <= this.index ; i++) {
			cellTemp = cell.getPointer();
			cell = null;
			cell = cellTemp;

		}	
		this.index = 0;
	}
	
	public Cell getProximo(Cell cell) {
		return cell.getPointer();
	}
	
	public Cell getUltimo() {
		Cell cell = this.cell;
		for (int i = 0; i <= this.index; i++) {
	       if (cell.getPointer() == null) {
	    	   return cell;
	       }   
	       else {
	    	   cell = getProximo(cell);
	       }
		}
		return null;
	}

	public Cell getCell() {
		return cell;
	}

	public void setCell(Cell cell) {
		this.cell = cell;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	
}
