SELECT a.id, a.name
FROM TableA a
LEFT JOIN TableB b 
  ON a.id = b.id
WHERE b.id IS NULL;
