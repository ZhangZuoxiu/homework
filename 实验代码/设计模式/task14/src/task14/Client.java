package task14;

public class Client {
	public static void main (String []args){
     AbstractPermission permission;
     permission=new PermissionProxy();
     permission.modifyUserInfo();
		permission.viewNote();
		permission.publishNote();
		permission.modifyNote();
		System.out.println("----------------------------");
		permission.setLevel(13);
		permission.modifyUserInfo();
		permission.viewNote();
		permission.publishNote();
		permission.modifyNote();
	}
}
