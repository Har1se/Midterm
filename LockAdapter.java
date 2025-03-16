class LockAdapter implements LegacyLockSystem {
    private OldLockSystem oldLock;

    public LockAdapter(OldLockSystem oldLock) {
        this.oldLock = oldLock;
    }

    @Override
    public void unlockDoor() {
        oldLock.openLock();
    }
}
