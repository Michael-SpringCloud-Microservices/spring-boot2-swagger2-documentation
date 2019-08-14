/**
 * 
 */
package com.michael.spring.boot.swagger.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author 109726
 *
 */
@ConfigurationProperties("spring.common.web.config.swagger")
public class CommonWebSwaggerProperties {

	private String title = "Spring Boot REST API";
	private String description = "\"Spring Boot REST API for Online Store\"";
	private String version = "1.0.0";
	private String license = "Apache License Version 2.0";
	private String licenseUrl  = "https://www.apache.org/licenses/LICENSE-2.0\"";
	private String authorName = "Michael Philomin Raj";
	private String authorWebsiteUrl = "https://springframework.guru/about/";
	private String authorEmailId = "michaelraj.p@gmail.com";
	private String controllerPackage = "com.michael.spring.boot.swagger.controllers";
	private String endpointsPath = "/product.*";
    private String frameworkPackagesToExclude = "org.springframework.boot";
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public CommonWebSwaggerProperties setTitle(String title) {
		this.title = title;
		return this;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public CommonWebSwaggerProperties setDescription(String description) {
		this.description = description;
		return this;
	}
	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}
	/**
	 * @param version the version to set
	 */
	public CommonWebSwaggerProperties setVersion(String version) {
		this.version = version;
		return this;
	}
	/**
	 * @return the license
	 */
	public String getLicense() {
		return license;
	}
	/**
	 * @param license the license to set
	 */
	public CommonWebSwaggerProperties setLicense(String license) {
		this.license = license;
		return this;
	}
	/**
	 * @return the licenseUrl
	 */
	public String getLicenseUrl() {
		return licenseUrl;
	}
	/**
	 * @param licenseUrl the licenseUrl to set
	 */
	public CommonWebSwaggerProperties setLicenseUrl(String licenseUrl) {
		this.licenseUrl = licenseUrl;
		return this;
	}
	/**
	 * @return the authorName
	 */
	public String getAuthorName() {
		return authorName;
	}
	/**
	 * @param authorName the authorName to set
	 */
	public CommonWebSwaggerProperties setAuthorName(String authorName) {
		this.authorName = authorName;
		return this;
	}
	/**
	 * @return the authorWebsiteUrl
	 */
	public String getAuthorWebsiteUrl() {
		return authorWebsiteUrl;
	}
	/**
	 * @param authorWebsiteUrl the authorWebsiteUrl to set
	 */
	public CommonWebSwaggerProperties setAuthorWebsiteUrl(String authorWebsiteUrl) {
		this.authorWebsiteUrl = authorWebsiteUrl;
		return this;
	}
	/**
	 * @return the authorEmailId
	 */
	public String getAuthorEmailId() {
		return authorEmailId;
	}
	/**
	 * @param authorEmailId the authorEmailId to set
	 */
	public CommonWebSwaggerProperties setAuthorEmailId(String authorEmailId) {
		this.authorEmailId = authorEmailId;
		return this;
	}
	/**
	 * @return the controllerPackage
	 */
	public String getControllerPackage() {
		return controllerPackage;
	}
	/**
	 * @param controllerPackage the controllerPackage to set
	 */
	public CommonWebSwaggerProperties setControllerPackage(String controllerPackage) {
		this.controllerPackage = controllerPackage;
		return this;
	}
	/**
	 * @return the endpointsPath
	 */
	public String getEndpointsPath() {
		return endpointsPath;
	}
	/**
	 * @param endpointsPath the endpointsPath to set
	 */
	public CommonWebSwaggerProperties setEndpointsPath(String endpointsPath) {
		this.endpointsPath = endpointsPath;
		return this;
	}
	/**
	 * @return the frameworkPackagesToExclude
	 */
	public String getFrameworkPackagesToExclude() {
		return frameworkPackagesToExclude;
	}
	/**
	 * @param frameworkPackagesToExclude the frameworkPackagesToExclude to set
	 */
	public CommonWebSwaggerProperties setFrameworkPackagesToExclude(String frameworkPackagesToExclude) {
		this.frameworkPackagesToExclude = frameworkPackagesToExclude;
		return this;
	}

	
	
}


