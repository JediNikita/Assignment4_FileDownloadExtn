package com.yodaplus.filedownloadextn.model;

import java.net.URL;

import org.springframework.stereotype.Component;

@Component
public class File {
		private String fileName;
		private URL url;
		private String path;
		
		public String getFileName() {
			return fileName;
		}
		public void setFileName(String fileName) {
			this.fileName = fileName;
		}
		public URL getUrl() {
			return url;
		}
		public void setUrl(URL url) {
			this.url = url;
		}
		public String getPath() {
			return path;
		}
		public void setPath(String path) {
			this.path = path;
		}
		
		
}
