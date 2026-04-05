cd /d "C:\Users\user\OneDrive\Desktop\Core Java"

echo %date% %time% >> daily-log.txt

git add .
git commit -m "daily update"
git push