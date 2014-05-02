package it.badgemania.badgehelp.properties;

import java.io.File;
import java.io.FileFilter;

import org.apache.commons.lang3.StringUtils;

public class PropertyFileFilter implements FileFilter {
	
	private final static String PROPERTY_FILE_EXTENSION = "properties";

	@Override
	public boolean accept(File pathname) {

		// skip sub directories
		if (pathname.isDirectory()) {
			return false;
		}

		String extension = getExtension(pathname.getName());

		if (PROPERTY_FILE_EXTENSION.equals(extension)) {
			return true;
		} else {
			return false;
		}

	}

	protected String getExtension(String filename) {
		if (StringUtils.isEmpty(filename)) {
			return StringUtils.EMPTY;
		}

		int lastDotIdx = filename.lastIndexOf(".");

		if (lastDotIdx == -1) {
			return StringUtils.EMPTY;
		}

		return filename.substring(lastDotIdx + 1);
	}

}
