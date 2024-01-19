package nestedCl1;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Door {
	private customLock lock=new customLock() {
		public boolean isUnLocked(String keyCode) {
			if(keyCode.equals("querty")) {
				return true;
			}else {
				return false;
			}
		}

		@Override
		public boolean isUnlocked(String keyCode) {
			// TODO Auto-generated method stub
			return false;
		}
	};
	public Lock getLocked() {
		return lock;
	}
}
