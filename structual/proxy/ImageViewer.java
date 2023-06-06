package structual.proxy;

//Client code
public class ImageViewer {
	public static void main(String[] args) {
		Image image1 = new ProxyImage("image1.jpg");
		Image image2 = new ProxyImage("image2.jpg");

		// Image will be loaded and displayed
		image1.display();

		// Image will be displayed immediately since it's already loaded
		image1.display();

		// Image will be loaded and displayed
		image2.display();
	}
}
