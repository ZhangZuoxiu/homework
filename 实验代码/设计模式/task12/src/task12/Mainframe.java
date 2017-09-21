package task12;

public class Mainframe {
 private CPU cpu;
 private HardDisk harddisk;
 private OS os;
 private Memory memory;
 public  Mainframe()
 {
	 cpu=new CPU();
	 memory=new Memory();
	 harddisk=new HardDisk();
	 os=new OS();
 }
 public void on()
 {
	 memory.check();
	 cpu.run();
	 harddisk.read();
	 os.load();
 }
 public void off()
 {
	 memory.faile();
	 cpu.faile();
	 harddisk.faile();
	 os.faile();
 }
}
