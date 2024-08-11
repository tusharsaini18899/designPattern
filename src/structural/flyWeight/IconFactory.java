package structural.flyWeight;

import java.util.HashMap;
import java.util.Map;

public class IconFactory {
    private Map<String, Icon> iconCache = new HashMap<>();

    public Icon getIcon(String key) {
        Icon icon = null;
        if (iconCache.containsKey(key)) {
            return iconCache.get(key);
        } else {
            if (key.equals("file")) {
                icon = new FileIcon("image", "Test File");
            } else if (key.equals("folder")) {
                icon = new FolderIcon("folder", "Test Folder");
            }
        }
        iconCache.put(key, icon);
        return icon;
    }
}
