package entities;

public class KeyState {
	public boolean right_key = false, left_key = false, enter_key = false,
			esc_key = false;
	
	public String toString()
	{
		return "Right: " + right_key + " left: " + left_key;
	}
}
