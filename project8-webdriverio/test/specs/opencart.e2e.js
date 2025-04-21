describe('OpenCart Demo', () => {
    it('should navigate to the Desktops page', async () => {
        await browser.url('https://demo.opencart.com/');
        await expect(browser).toHaveTitle('Your Store');

        const desktopsLink = await $('=Desktops');
        await desktopsLink.click();

        const showAllDesktopsLink = await $('=Show All Desktops');
        await showAllDesktopsLink.click();

        await expect(browser).toHaveTitle('Desktops');
    });
});