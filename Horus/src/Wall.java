import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Wall implements Structure {
	private List<Block> blocks;
	
	// zwraca dowolny element o podanym kolorze
	@Override
	public Optional<Block> findBlockByColor(String color) {
		Block block = null;
		for (Block temp : this.getBlockList()) {
			String tempColor = temp.getColor();
			if (tempColor.equals(color)) {
				block = temp;
				break;
			}
		}
		return Optional.ofNullable(block);
	}

	// zwraca wszystkie elementy z danego materia³u
	@Override
	public List<Block> findBlocksByMaterial(String material) {
		List<Block> blockList = new ArrayList<>();
		for (Block temp : this.getBlockList()) {
			String tempMaterial = temp.getMaterial();
			if (tempMaterial.equals(material)) {
				blockList.add(temp);
			}
		}
		return blockList;
	}

	//zwraca liczbê wszystkich elementów tworz¹cych strukturê
	@Override
	public int count() {
		return this.getBlockList().size();
	}
	
	public void setBlockList(List<Block> blocks){
		this.blocks = blocks;
	}
	
	public List<Block> getBlockList(){
		return this.blocks;
	}
}
