print ('Generating...')
file = open('accent_styles.xml', 'w')

file.write('<?xml version="1.0" encoding="utf-8"?>\n')
file.write('<resources>\n')

for red in range(0, 0xff+0x0f, 0x0f):
	for green in range(0, 0xff+0x0f, 0x0f):
		for blue in range(0, 0xff+0x0f, 0x0f):
			hex = format(red, '02x') + format(green, '02x') + format(blue, '02x')
			file.write('\t<style name="Accent_ff' + hex + '">\n')
			file.write('\t\t<item name="android:colorAccent">#ff' + hex + '</item>\n')
			file.write('\t</style>\n')

file.write('</resources>\n')

file.close()
print ('Done.')
