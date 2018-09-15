public class Move
{

	private int disk;
	private int from;
	private int to;

	public Move(int disk, int from, int to)
	{
		this.disk = disk;
		this.from = from;
		this.to = to;
	}

	public int getDisk(){return disk;} //getters
	public int getFrom(){return from;}
	public int getTo(){return to;}


}
