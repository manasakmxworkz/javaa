class TextileRunner{

	public static void main(String materials[]){
	
	boolean value=Textile.addMaterial("Cotton");
	System.out.println(value);
	value=Textile.addMaterial("Linen");
	System.out.println(value);
	value=Textile.addMaterial("Silk");
	System.out.println(value);
	value=Textile.addMaterial("Denim");
	System.out.println(value);
	value=Textile.addMaterial("Polyester");
	System.out.println(value);
	value=Textile.addMaterial("Wool");
	System.out.println(value);
	value=Textile.addMaterial("Lace");
	System.out.println(value);
	value=Textile.addMaterial("Satin");
	System.out.println(value);
	value=Textile.addMaterial("Rayon");
	System.out.println(value);
	value=Textile.addMaterial("Velvet");
	System.out.println(value);
	value=Textile.addMaterial("Acrylic");
	System.out.println(value);
	value=Textile.addMaterial("Damask");
	System.out.println(value);
	value=Textile.addMaterial("Corduroy");
	System.out.println(value);
	value=Textile.addMaterial("Chintz");
	System.out.println(value);
	Textile.getAllmaterialInfo();
	boolean val=Textile.updateMaterial("Chintz","Elastane");
	Textile.getAllmaterialInfo();
	boolean output=Textile.delMaterial("Corduroy");
	Textile.getAllmaterialInfo();
	}
}