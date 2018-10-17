public class permissionex1 {
	
	protected PermissionCollection getPermissions(CodeSource cs) {			//bad
		
		PermissionCollection pc = new Permissions();
		
		// Allow exit from the VM anytime
		
		pc.add(new RuntimePermission("exitVM"));
		
		return pc;
		
	}
	
	protected PermissionCollection getPermissions(CodeSource cs) {			//good
		
		PermissionCollection pc = super.getPermissions(cs);
		
		// Allow exit from the VM anytime
		
		pc.add(new RuntimePermission("exitVM"));
		
		return pc;
		
	}
}


