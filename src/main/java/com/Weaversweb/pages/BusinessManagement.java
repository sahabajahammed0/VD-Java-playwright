package com.Weaversweb.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Weaversweb.base.BasePage;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class BusinessManagement extends BasePage {

    private static final Logger logger = LogManager.getLogger(LoginPage.class);

    public BusinessManagement(Page page) {
        super(page);

    }

    private final String allapproveButtonSelector = "//table//button[@aria-label='Business Approve']";
    private final String approveButtonSelector = "//button[normalize-space()='Approve']";

    public void approveAllBusiness() {
        // Convert String selectors to Locators
        Locator allapproveButtons = page.locator(allapproveButtonSelector);
        Locator approveButtons = page.locator(approveButtonSelector);

        int totalItems = allapproveButtons.count();
       

        logger.info("Found {} items to approve", totalItems);

        // Process each item sequentially
        for (int i = 0; i < totalItems; i++) {
            try {
                logger.info("Approving item {} of {}", (i + 1), totalItems);

                // Click the approve button in the table
                allapproveButtons.nth(i).click();

                // Wait for any potential UI updates
                page.waitForTimeout(1000);

                // If there's a confirmation approve button, click it
                if (approveButtons.count() > 0) {
                    approveButtons.nth(0).click(); // Usually the first approve button in modal
                }

                // Wait for approval to complete
                page.waitForTimeout(2000);

                logger.info("Successfully approved item {}", (i + 1));

            } catch (Exception e) {
                logger.error("Failed to approve item {}: {}", (i + 1), e.getMessage());
                // Continue with next item even if one fails
            }
        }

    }
}

