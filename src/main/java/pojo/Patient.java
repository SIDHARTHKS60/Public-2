package pojo;

public class Patient {
	private int ptid;
    private String ptname,ptaddr;
    private long phno;
	
    public int getPtid() {
		return ptid;}
    
	public void setPtid(int ptid) {
		this.ptid = ptid;}
	
	public String getPtname() {
		return ptname;}
	
	public void setPtname(String ptname) {
		this.ptname = ptname;}
	
	public String getPtaddr() {
		return ptaddr;}
	
	public void setPtaddr(String ptaddr) {
		this.ptaddr = ptaddr;}
	
	public long getPhno() {
		return phno;}
	
	public void setPhno(long phno) {
		this.phno = phno;}
    
}
