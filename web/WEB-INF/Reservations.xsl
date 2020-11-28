<xsl:stylesheet version="1.0" xmlns:uts="http://www.uts.edu.au/31284/wsd-diary" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" indent="yes" />
   
    <xsl:template match="//uts:Reservations">
        <html>
            <head>
            </head>
            <body>
                <table>
                    <thead>
                        <tr>
                            <th>Title</th>
                            <th>Email</th>
                            <th>Name</th>
                        </tr>
                    </thead>
                    <tbody>
                        <xsl:apply-templates/>
                    </tbody>
                </table>  
            </body>
        </html>
    </xsl:template>
   
   <xsl:template match="uts:reservation">
        <tr>
            <xsl:apply-templates/>
        </tr>
    </xsl:template>
    
    <xsl:template match="uts:reservation/uts:booktitle|uts:email|uts:name">
        <td>
            <xsl:apply-templates/>
        </td>
    </xsl:template>
</xsl:stylesheet>
